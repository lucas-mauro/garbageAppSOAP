
/**
 * GarbageAppFileSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package org.example.www.garbageappfile;

import org.example.www.garbageappfile.projectclasses.RegisterUserProcess;

/**
 * GarbageAppFileSkeleton java skeleton for the axisService
 */
public class GarbageAppFileSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param addRecyclingToUser
	 * @return addRecyclingToUserResponse
	 */

	public org.example.www.garbageappfile.AddRecyclingToUserResponse addRecyclingToUser(
			org.example.www.garbageappfile.AddRecyclingToUser addRecyclingToUser) {
		// TODO : fill this with the necessary business logic
		//throw new java.lang.UnsupportedOperationException(
			//	"Please implement " + this.getClass().getName() + "#addRecyclingToUser");
		AddRecyclingToUserResponse addReToUserRes = new AddRecyclingToUserResponse();
		
		return addReToUserRes;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getUserTotalRecycling
	 * @return getUserTotalRecyclingResponse
	 */

	public org.example.www.garbageappfile.GetUserTotalRecyclingResponse getUserTotalRecycling(
			org.example.www.garbageappfile.GetUserTotalRecycling getUserTotalRecycling) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getUserTotalRecycling");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getAllRecyclingByUser
	 * @return getAllRecyclingByUserResponse
	 */

	public org.example.www.garbageappfile.GetAllRecyclingByUserResponse getAllRecyclingByUser(
			org.example.www.garbageappfile.GetAllRecyclingByUser getAllRecyclingByUser) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getAllRecyclingByUser");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param registerUser
	 * @return registerUserResponse
	 */

	public org.example.www.garbageappfile.RegisterUserResponse registerUser(
			org.example.www.garbageappfile.RegisterUser registerUser) {
		User myUser = registerUser.getUser();
		RegisterUserResponse usrRpns = new RegisterUserResponse();
		RegisterUserProcess usrProc = RegisterUserProcess.getInstance();
		usrRpns.setUser(usrProc.addNewUser(myUser));
		return usrRpns;
	}

}
