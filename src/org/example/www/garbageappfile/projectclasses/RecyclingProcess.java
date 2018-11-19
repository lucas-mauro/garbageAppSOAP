package org.example.www.garbageappfile.projectclasses;

import java.util.ArrayList;

import org.example.www.garbageappfile.AddRecyclingToUser;
import org.example.www.garbageappfile.User;
import org.example.www.garbageappfile.UserRecycling;

public class RecyclingProcess {
	private static RecyclingProcess object;
	private ArrayList<UserRecycling> recyclings = new ArrayList<UserRecycling>();
	private static long id = 0;

	public static RecyclingProcess getInstance() {
		if (object != null) {
			return object;
		}
		return object = new RecyclingProcess();
	};

	public UserRecycling addNewRecycling(AddRecyclingToUser addRecyclingToUser) {
		 
		RegisterUserProcess regUserProcess = RegisterUserProcess.getInstance();
		User usr = regUserProcess.findByUserName(addRecyclingToUser.getUserName());
		if (usr != null) {
			id++;
			addRecyclingToUser.getUserRecycling().setId(id);
			addRecyclingToUser.getUserRecycling().setUser(usr);
			recyclings.add(addRecyclingToUser.getUserRecycling());
		}
		return addRecyclingToUser.getUserRecycling();
	}
	
	public UserRecycling[] getAllRecyclingByUser(String userName){
		ArrayList<UserRecycling> ret_Recyclings = new ArrayList<UserRecycling>();
		for(int i=0; i<recyclings.size(); i++) {
			if(recyclings.get(i).getUser().getUserName().equals(userName)) 
				ret_Recyclings.add(recyclings.get(i));
		}
		UserRecycling[] retUsrRecy = new UserRecycling[ret_Recyclings.size()];
		for(int i=0; i<ret_Recyclings.size(); i++) {
			retUsrRecy[i] = ret_Recyclings.get(i);
		}
		return retUsrRecy;
		
	}
}