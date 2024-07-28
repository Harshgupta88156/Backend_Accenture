package com.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev.model.task;
import com.dev.service.task_service;

@CrossOrigin
@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private task_service taskService;

    // Endpoint to get all tasks
    @GetMapping
    public List<task> getAllTasks() {
        return taskService.getalltask();
    }

    // Endpoint to get a task by ID
    @GetMapping("/{id}")
    public task getTaskById(@PathVariable int id) {
        return taskService.gettaskbyID(id);
    }

    // Endpoint to get the progress of a task by ID
    @GetMapping("/{id}/progress")
    public int getTaskProgress(@PathVariable int id) {
        return taskService.progress(id);
    }

    // Endpoint to update the progress of a task by ID
    @PutMapping("/{id}/progress")
    public task updateTaskProgress(@PathVariable int id) {
        taskService.updateprogress(id);
        return taskService.gettaskbyID(id);
    }
    @PostMapping("/delete")
    public void deletetask(@RequestBody task t) {
    	taskService.deletetask(t.getTask_id());
    }
}
