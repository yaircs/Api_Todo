package com.projectPrimer.rest.controller;

import com.projectPrimer.rest.Model.Task;
import com.projectPrimer.rest.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    @GetMapping(value = "/")
    public String holaMundo(){
        return "HOLA MUNDO!!!";
    }
    @GetMapping(value = "/tasks")
    public List<Task> getTasks(){
        return todoRepository.findAll();
    }

    @PostMapping(value = "/create")
    public String saveTask(@RequestBody Task task){
        todoRepository.save(task);
        return "saveTask";
    }
    @PutMapping(value = "/updatetask/{id}")
    public String updateTask(@PathVariable long id, @RequestBody Task task){
        Task updateTask = todoRepository.findById(id).get();
        updateTask.setTitle(task.getTitle());
        updateTask.setDescripcion(task.getDescripcion());
        todoRepository.save(updateTask);
        return "tarea actualizada";
    }





}
