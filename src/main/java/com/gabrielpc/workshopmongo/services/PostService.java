package com.gabrielpc.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielpc.workshopmongo.domain.Post;
import com.gabrielpc.workshopmongo.repository.PostRepository;
import com.gabrielpc.workshopmongo.service.exception.ObjectNotFoundExcepetion;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	

	public Post findById(String id) {
		Post user = repo.findById(id).orElse(null);
		if (user == null) {
			throw new ObjectNotFoundExcepetion("Objeto não encontrado");
		}
		return user;
	}
	
	
}
