package org.example.www.garbageappfile.projectclasses;

import java.util.ArrayList;

import org.example.www.garbageappfile.Recycling;
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

	public UserRecycling addNewRecycling(UserRecycling recycling) {
		id++;
		recycling.setId(id);
		recyclings.add(recycling);
		return recycling;
	}

}
