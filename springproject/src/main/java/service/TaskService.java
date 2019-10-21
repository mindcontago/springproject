package service;

import model.Task;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public interface TaskService {
    void createTask(Long userId, String taskName);
    void deleteTask(Long taskId);
    Set<Task> findAllUserTasks(Long userId);
    void closeTask(Long taskId);
    void openTask(Long taskId);
}