package controller;

import lombok.RequiredArgsConstructor;
import model.Task;
import org.springframework.stereotype.Component;
import service.AuthService;
import service.TaskService;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;
    private final AuthService authService;

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
