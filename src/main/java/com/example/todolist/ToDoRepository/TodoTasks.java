package com.example.todolist.ToDoRepository;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class TodoTasks {

    @Id
    private int id;
    private String title;
    private String text;
    private boolean status;
}
