package com.app.todoapp.service;

import com.app.todoapp.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {

    public List<Task> getAllTasks();

    public void createTask(String title);

    public void deleteTask(Long id);

    public void toggleTask(Long id);

}
