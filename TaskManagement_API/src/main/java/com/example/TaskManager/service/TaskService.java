package com.example.TaskManager.service;

import com.example.TaskManager.model.Task;
import com.example.TaskManager.repo.TaskRepo;
import org.springframework.stereotype.Service;
import org.modelmapper.*;

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

    public Task updateTask(long id, Task updatedTask){
        Task existingTask = getTaskById(id);
        if (existingTask != null){
            existingTask.setTitle(updatedTask.getTitle());
            existingTask.setDescription(updatedTask.getDescription());
            existingTask.setCompleted(updatedTask.isCompleted());
            repo.save(existingTask);

            /*
            // ModelMapper updates the entire entity and not partially.
            if (updatedTask.getTitle() != null && updatedTask.getDescription() != null){
                ModelMapper modelMapper = new ModelMapper();
                modelMapper.map(updatedTask, existingTask);
                repo.save(existingTask);
            }
             */
        }
        return null;
    }

    public void deleteTask(long id){
        repo.deleteById(id);
    }

    public List<Task> findByCompleted(boolean completed){
        return repo.findByCompleted(completed);
    }
}
