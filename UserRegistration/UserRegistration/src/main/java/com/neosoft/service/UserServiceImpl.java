package com.neosoft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.neosoft.model.User;
import com.neosoft.repository.UserRepository;

import lombok.var;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(int userId) {
		return userRepository.findById(userId);
	}

	@Override
	public void deleteUserById(int userId) {
		 userRepository.deleteById(userId);
		
	}
	
	

	@Override
	public User getByFirstName(String firstName) {
		return userRepository.findByFirstName(firstName);
	}

	@Override
	public User getBySurname(String surname) {
		
		return userRepository.findBySurname(surname);
	}

	@Override
	public User getByPinCode(String pinCode) {
		return userRepository.findByPinCode(pinCode);
	}

	@Override
	public User getUserByFlagId(int userId) {
		return userRepository.findByUserId(userId);
	}

	@Override
	public List<User> findByOrderByDojAsc() {
		return userRepository.findByOrderByDojAsc();
	}

	@Override
	public List<User> findByOrderByDobAsc() {
		return userRepository.findByOrderByDobAsc();
	}

	

	
	

}
