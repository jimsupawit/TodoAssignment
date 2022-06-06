package com.example.todolist.ToDoControlelr;


import com.example.todolist.ToDoRepository.ToDoInterface;
import com.example.todolist.ToDoRepository.TodoTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class todoController {

    @Autowired
    private ToDoInterface todolist;


    @RequestMapping(value="/todolist/getAllTask", method = RequestMethod.GET)
    public List<TodoTasks> getAllTasks(){
        return todolist.findAll();
    }

    @RequestMapping(value="/todolist/getTaskByID", method = RequestMethod.GET)
    public @ResponseBody TodoTasks(@RequestParam("Id")int id){
        return TodoTasks.findById(id);
    }


}
