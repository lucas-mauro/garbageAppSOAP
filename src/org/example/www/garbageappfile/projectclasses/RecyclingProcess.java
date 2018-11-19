package org.example.www.garbageappfile.projectclasses;

import java.util.ArrayList;

import org.example.www.garbageappfile.AddRecyclingToUser;
import org.example.www.garbageappfile.User;
import org.example.www.garbageappfile.UserRecycling;

public class RecyclingProcess {
	private static RecyclingProcess object;
	private ArrayList<AddRecyclingToUser> recyclings = new ArrayList<AddRecyclingToUser>();
	private static long id = 0;

	public static RecyclingProcess getInstance() {
		if (object != null) {
			return object;
		}
		return object = new RecyclingProcess();
	};

	public AddRecyclingToUser addNewRecycling(AddRecyclingToUser addRecyclingToUser) {
		 
		RegisterUserProcess regUserProcess = RegisterUserProcess.getInstance();
		User usr = regUserProcess.findByUserName(addRecyclingToUser.getUserName());
		if (usr != null) {
			id++;
			addRecyclingToUser.getUserRecycling().setId(id);
			addRecyclingToUser.getUserRecycling().setUser(usr);
			recyclings.add(addRecyclingToUser);
		}
		return addRecyclingToUser;
	}
}