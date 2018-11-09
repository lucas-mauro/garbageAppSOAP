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
		id++;
		user.setId(id);
		users.add(user);
		return user;
	}

}
