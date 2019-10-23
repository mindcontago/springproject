package main.java.controller;

import lombok.RequiredArgsConstructor;
import main.java.service.AuthService;
import main.java.service.TaskService;
import model.Task;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;
    private final AuthService authService;

    public TaskController(TaskService taskService, AuthService authService) {
        this.taskService = taskService;
        this.authService = authService;
    }

    public void createTask(String taskName){
        taskService.createTask(authService.getUserId(), taskName);
    }

    public void closeTask(Long taskId) {
        authService.checkAuth();
        taskService.closeTask(taskId);
    }

    public void openTask(Long taskId) {
        authService.checkAuth();
        taskService.openTask(taskId);
    }
    public void deleteTask(Long taskId) {
        authService.checkAuth();
        taskService.deleteTask(taskId);
    }

    public Set<Task> findAllTasksByUser() {
        return taskService.findAllUserTasks(authService.getUserId());
    }
}
