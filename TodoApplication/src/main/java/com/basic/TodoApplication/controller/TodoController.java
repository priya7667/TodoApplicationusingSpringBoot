package com.basic.TodoApplication.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.TodoApplication.model.TodoEntity;
import com.basic.TodoApplication.repository.TodoRepo;

@RestController
@RequestMapping(value="/todo")
public class TodoController {
	
	@Autowired
	private TodoRepo todoRepo;
	
	@GetMapping
	private List<TodoEntity> findAll()
	{
		return todoRepo.findAll();
	}
	
	@PostMapping
	public TodoEntity save(@RequestBody TodoEntity todoEntity)
	{
		return todoRepo.save(todoEntity);
	}
	
	@PutMapping
	public TodoEntity update(@RequestBody TodoEntity todoEntity)
	{
		return todoRepo.save(todoEntity);
	}
	
	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable Long id)
	{
		todoRepo.deleteById(id);
	}
	
	
	
	

}
