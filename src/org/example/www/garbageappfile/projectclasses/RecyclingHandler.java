package org.example.www.garbageappfile.projectclasses;

import java.util.ArrayList;

import org.example.www.garbageappfile.AddRecyclingToUser;
import org.example.www.garbageappfile.Material;
import org.example.www.garbageappfile.Recycling;
import org.example.www.garbageappfile.User;
import org.example.www.garbageappfile.UserRecycling;

public class RecyclingHandler {
	private static RecyclingHandler object;
	private ArrayList<UserRecycling> recyclings = new ArrayList<UserRecycling>();
	private static long id = 0;

	public static RecyclingHandler getInstance() {
		if (object != null) {
			return object;
		}
		return object = new RecyclingHandler();
	};

	public UserRecycling addNewRecycling(AddRecyclingToUser addRecyclingToUser) {
		 
		UserHandler regUserProcess = UserHandler.getInstance();
		User usr = regUserProcess.findByUserName(addRecyclingToUser.getUserName());
		Material material = MaterialHandler.getInstance().getMaterial(addRecyclingToUser.getUserRecycling().getObject().getId());
		if (usr != null) {
			id++;
			addRecyclingToUser.getUserRecycling().setId(id);
			addRecyclingToUser.getUserRecycling().setUser(usr);
			if(material != null)
				addRecyclingToUser.getUserRecycling().setObject(material);
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
	
	public Recycling getTotalRecycling(Material material) {
		Recycling recycling = new Recycling();
		recycling.setObject(material.getId());
		float total = 0f;
		for(int i = 0; i < recyclings.size(); i++) {
			if (recyclings.get(i).getObject().getId() == material.getId())
				total = total + ( recyclings.get(i).getQuantity() * recyclings.get(i).getObject().getWeight());
		}
		recycling.setTons(total);
		return recycling;
	}
}