package com.basic.TodoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basic.TodoApplication.model.TodoEntity;

public interface TodoRepo extends JpaRepository<TodoEntity,Long>{

}
