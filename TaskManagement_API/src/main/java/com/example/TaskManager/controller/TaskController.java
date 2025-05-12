package com.example.TaskManager.controller;

import com.example.TaskManager.model.Task;
import com.example.TaskManager.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
@RequestMapping("/api/task-manager")
public class TaskController {

    TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping("/task")
    public ResponseEntity<?> createTask(@RequestBody Task task){
        try {
            Task task1 = service.createTask(task);
            return new ResponseEntity<>(task1, HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks(@RequestParam(required = false) Boolean completed){
        try {
            // filtering based on completion status...
            if (completed != null) {
                List<Task> completedTasks = service.findByCompleted(completed);
                return new ResponseEntity<>(completedTasks, HttpStatus.OK);
            }

            // else fetch all tasks
            List<Task> tasks = service.getAllTasks();
            return new ResponseEntity<>(tasks, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/task/{id}")
    public ResponseEntity<String> updateTask(@PathVariable long id,@RequestBody Task updatedtask){
        Task task = null;
        try {
            task = service.updateTask(id, updatedtask);
        } catch (Exception e){
            return new ResponseEntity<>("Unable to update task.", HttpStatus.BAD_REQUEST);
        }

        if (service.getTaskById(id) != null) {
            return new ResponseEntity<>("Task updated successfully.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Failed to update task.",HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("task/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable long id){
        if (service.getTaskById(id) != null) {
            service.deleteTask(id);
            return new ResponseEntity<>("Task Successfully Deleted.", HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>("No Such Task Exist.", HttpStatus.BAD_REQUEST);
    }

//    @GetMapping("/tasks/completed")
//    public ResponseEntity<List<Task>> getCompletedTasks(@RequestParam (defaultValue = "true") boolean completed){
//        List<Task> tasks = service.findByCompleted(completed);
//        return new ResponseEntity<>(tasks, HttpStatus.OK);
//    }
}
