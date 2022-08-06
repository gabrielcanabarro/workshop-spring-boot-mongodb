package com.gabrielpc.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielpc.workshopmongo.domain.User;
import com.gabrielpc.workshopmongo.dto.UserDTO;
import com.gabrielpc.workshopmongo.repository.UserRepository;
import com.gabrielpc.workshopmongo.service.exception.ObjectNotFoundExcepetion;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		User user = repo.findById(id).orElse(null);
		if (user == null) {
			throw new ObjectNotFoundExcepetion("Objeto não encontrado");
		}
		return user;
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
}
}
