package com.example.TaskManager.service;

import com.example.TaskManager.model.Task;
import com.example.TaskManager.repo.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    TaskRepo repo;

    public TaskService(TaskRepo repo) {
        this.repo = repo;
    }


    public Task createTask(Task task){
        return repo.save(task);
    }

    public List<Task> getAllTasks(){
        return repo.findAll();
    }

    public Task getTaskById(long id){
        return repo.findById(id).orElse(null);
    }

    public Task updateTask(long id, Task task){
        if (getTaskById(id) != null){
            return repo.save(task);
        }
        return null;
    }

    public void deleteTask(long id){
        repo.deleteById(id);
    }
}
