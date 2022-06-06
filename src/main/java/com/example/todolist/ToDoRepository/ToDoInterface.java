package com.example.todolist.ToDoRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface ToDoInterface extends CrudRepository<TodoTasks, Integer > {

    public Collection<TodoTasks> getAllTasks();
}
