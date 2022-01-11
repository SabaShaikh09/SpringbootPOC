package com.neosoft.service;

import java.util.List;
import java.util.Optional;

import com.neosoft.model.User;


public interface UserService {
	
	public User addUser(User user);
	
	public List<User> getAllUsers();
	
	public Optional<User> getUserById(int userId);
	
	public void deleteUserById(int userId);

	public User getByFirstName(String firstName);

	public User getBySurname(String surname);

	public User getByPinCode(String pinCode);

	public User getUserByFlagId(int userId);

	public List<User> findByOrderByDojAsc();

	public List<User> findByOrderByDobAsc();

	
	
	

	

	


	
	

}
