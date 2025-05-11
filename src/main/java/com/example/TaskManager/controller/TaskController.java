package com.example.TaskManager.controller;

import com.example.TaskManager.model.Task;
import com.example.TaskManager.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task-manager")
public class TaskController {

    TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping("/tasks")
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        Task task1 = service.createTask(task);
        return new ResponseEntity<>(task1, HttpStatus.CREATED);
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks(){
        List<Task> tasks = service.getAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PutMapping("/tasks/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable long id,@RequestBody Task updatedtask){
        Task task1 = service.updateTask(id, updatedtask);
        return new ResponseEntity<>(task1, HttpStatus.OK);
    }

    @DeleteMapping("tasks/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable long id){
        service.deleteTask(id);
        return new ResponseEntity<>("Task Successfully Deleted.", HttpStatus.NO_CONTENT);
    }

    @GetMapping("/tasks/completed")
    public ResponseEntity<List<Task>> findByCompleted(@RequestParam boolean completed){
        List<Task> tasks = service.findByCompleted(completed);
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }
}
