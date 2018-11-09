
/**
 * GarbageAppFileMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.garbageappfile;

        /**
        *  GarbageAppFileMessageReceiverInOut message receiver
        */

        public class GarbageAppFileMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        GarbageAppFileSkeleton skel = (GarbageAppFileSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("addRecyclingToUser".equals(methodName)){
                
                org.example.www.garbageappfile.AddRecyclingToUserResponse addRecyclingToUserResponse17 = null;
	                        org.example.www.garbageappfile.AddRecyclingToUser wrappedParam =
                                                             (org.example.www.garbageappfile.AddRecyclingToUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbageappfile.AddRecyclingToUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addRecyclingToUserResponse17 =
                                                   
                                                   
                                                         skel.addRecyclingToUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addRecyclingToUserResponse17, false, new javax.xml.namespace.QName("http://www.example.org/garbageAppFile/",
                                                    "addRecyclingToUser"));
                                    } else 

            if("getUserTotalRecycling".equals(methodName)){
                
                org.example.www.garbageappfile.GetUserTotalRecyclingResponse getUserTotalRecyclingResponse19 = null;
	                        org.example.www.garbageappfile.GetUserTotalRecycling wrappedParam =
                                                             (org.example.www.garbageappfile.GetUserTotalRecycling)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbageappfile.GetUserTotalRecycling.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getUserTotalRecyclingResponse19 =
                                                   
                                                   
                                                         skel.getUserTotalRecycling(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getUserTotalRecyclingResponse19, false, new javax.xml.namespace.QName("http://www.example.org/garbageAppFile/",
                                                    "getUserTotalRecycling"));
                                    } else 

            if("getAllRecyclingByUser".equals(methodName)){
                
                org.example.www.garbageappfile.GetAllRecyclingByUserResponse getAllRecyclingByUserResponse21 = null;
	                        org.example.www.garbageappfile.GetAllRecyclingByUser wrappedParam =
                                                             (org.example.www.garbageappfile.GetAllRecyclingByUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbageappfile.GetAllRecyclingByUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllRecyclingByUserResponse21 =
                                                   
                                                   
                                                         skel.getAllRecyclingByUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllRecyclingByUserResponse21, false, new javax.xml.namespace.QName("http://www.example.org/garbageAppFile/",
                                                    "getAllRecyclingByUser"));
                                    } else 

            if("registerUser".equals(methodName)){
                
                org.example.www.garbageappfile.RegisterUserResponse registerUserResponse23 = null;
	                        org.example.www.garbageappfile.RegisterUser wrappedParam =
                                                             (org.example.www.garbageappfile.RegisterUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbageappfile.RegisterUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               registerUserResponse23 =
                                                   
                                                   
                                                         skel.registerUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), registerUserResponse23, false, new javax.xml.namespace.QName("http://www.example.org/garbageAppFile/",
                                                    "registerUser"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbageappfile.AddRecyclingToUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbageappfile.AddRecyclingToUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbageappfile.AddRecyclingToUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbageappfile.AddRecyclingToUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbageappfile.GetUserTotalRecycling param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbageappfile.GetUserTotalRecycling.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbageappfile.GetUserTotalRecyclingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbageappfile.GetUserTotalRecyclingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbageappfile.GetAllRecyclingByUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbageappfile.GetAllRecyclingByUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbageappfile.GetAllRecyclingByUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbageappfile.GetAllRecyclingByUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbageappfile.RegisterUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbageappfile.RegisterUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbageappfile.RegisterUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbageappfile.RegisterUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbageappfile.AddRecyclingToUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbageappfile.AddRecyclingToUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbageappfile.AddRecyclingToUserResponse wrapaddRecyclingToUser(){
                                org.example.www.garbageappfile.AddRecyclingToUserResponse wrappedElement = new org.example.www.garbageappfile.AddRecyclingToUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbageappfile.GetUserTotalRecyclingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbageappfile.GetUserTotalRecyclingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbageappfile.GetUserTotalRecyclingResponse wrapgetUserTotalRecycling(){
                                org.example.www.garbageappfile.GetUserTotalRecyclingResponse wrappedElement = new org.example.www.garbageappfile.GetUserTotalRecyclingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbageappfile.GetAllRecyclingByUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbageappfile.GetAllRecyclingByUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbageappfile.GetAllRecyclingByUserResponse wrapgetAllRecyclingByUser(){
                                org.example.www.garbageappfile.GetAllRecyclingByUserResponse wrappedElement = new org.example.www.garbageappfile.GetAllRecyclingByUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbageappfile.RegisterUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbageappfile.RegisterUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbageappfile.RegisterUserResponse wrapregisterUser(){
                                org.example.www.garbageappfile.RegisterUserResponse wrappedElement = new org.example.www.garbageappfile.RegisterUserResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.garbageappfile.AddRecyclingToUser.class.equals(type)){
                
                           return org.example.www.garbageappfile.AddRecyclingToUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbageappfile.AddRecyclingToUserResponse.class.equals(type)){
                
                           return org.example.www.garbageappfile.AddRecyclingToUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbageappfile.GetUserTotalRecycling.class.equals(type)){
                
                           return org.example.www.garbageappfile.GetUserTotalRecycling.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbageappfile.GetUserTotalRecyclingResponse.class.equals(type)){
                
                           return org.example.www.garbageappfile.GetUserTotalRecyclingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbageappfile.GetAllRecyclingByUser.class.equals(type)){
                
                           return org.example.www.garbageappfile.GetAllRecyclingByUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbageappfile.GetAllRecyclingByUserResponse.class.equals(type)){
                
                           return org.example.www.garbageappfile.GetAllRecyclingByUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbageappfile.RegisterUser.class.equals(type)){
                
                           return org.example.www.garbageappfile.RegisterUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbageappfile.RegisterUserResponse.class.equals(type)){
                
                           return org.example.www.garbageappfile.RegisterUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    