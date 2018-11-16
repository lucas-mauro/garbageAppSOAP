package org.example.www.garbageappfile.projectclasses;

import java.util.ArrayList;

import org.example.www.garbageappfile.AddRecyclingToUser;
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
		id++;
		addRecyclingToUser.getUserRecycling().setId(id);
//		addRecyclingToUser.getUserName()
		recyclings.add(addRecyclingToUser);
		return addRecyclingToUser;
	}
}