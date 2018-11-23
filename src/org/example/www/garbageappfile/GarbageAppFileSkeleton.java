/**
 * GarbageAppFileSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package org.example.www.garbageappfile;

import org.example.www.garbageappfile.projectclasses.RecyclingHandler;
import org.example.www.garbageappfile.projectclasses.UserHandler;

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
		AddRecyclingToUserResponse addReToUserRes = new AddRecyclingToUserResponse();
		addReToUserRes.setUserRecycling(RecyclingHandler.getInstance().addNewRecycling(addRecyclingToUser));
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
		GetUserTotalRecyclingResponse response = new GetUserTotalRecyclingResponse();
		response.setRecycling(
				RecyclingHandler.getInstance().getTotalRecycling(getUserTotalRecycling.getMaterial())
				);
		return response;
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
		GetAllRecyclingByUserResponse response = new GetAllRecyclingByUserResponse();
		response.setUserRecicling(
				RecyclingHandler.getInstance().getAllRecyclingByUser(getAllRecyclingByUser.getUserName())
				);
		return response;
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
		UserHandler usrProc = UserHandler.getInstance();
		usrRpns.setUser(usrProc.addNewUser(myUser));
		return usrRpns;
	}

}
