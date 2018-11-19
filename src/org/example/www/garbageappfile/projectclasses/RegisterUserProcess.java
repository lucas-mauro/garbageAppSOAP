package org.example.www.garbageappfile.projectclasses;

import java.util.ArrayList;
import java.util.UUID;

import org.example.www.garbageappfile.RegisterUser;
import org.example.www.garbageappfile.RegisterUserResponse;
import org.example.www.garbageappfile.User;

public class RegisterUserProcess {
	private static RegisterUserProcess object;
	private ArrayList<User> users = new ArrayList<User>();
	private static long id = 0;

	public static RegisterUserProcess getInstance() {
		if (object != null) {
			return object;
		}
		return object = new RegisterUserProcess();
	};
	
	public User addNewUser(User user) {
		//Se deberia chequear la unicidad de user
		id++;
		user.setId(id);
		users.add(user);
		return user;
	}
	
	public User findByUserName(String userName) {
		for(int i = 0; i<users.size(); i++) {
			if (userName.equals(users.get(i).getUserName())) 
				return users.get(i);
		}
		return null;
	}

}
