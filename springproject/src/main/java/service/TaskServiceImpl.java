package service;

import Repository.TaskRepositoryImpl;
import lombok.RequiredArgsConstructor;
import model.Task;
import model.TaskStatus;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepositoryImpl taskRepositoryImpl;

    @Override
    public void createTask(Long userId, String taskName) {
        taskRepositoryImpl.createTask(userId, taskName);
    }

    @Override
    public void deleteTask(Long taskId) {
        taskRepositoryImpl.deleteTask(taskId);
    }

    @Override
    public Set<Task> findAllUserTasks(Long userId) {
        return taskRepositoryImpl.findAllTasksByUser(userId);
    }

    @Override
    public void closeTask(Long taskId) {
        taskRepositoryImpl.setStatus(taskId, TaskStatus.CLOSED);
    }

    @Override
    public void openTask(Long taskId) {
        taskRepositoryImpl.setStatus(taskId, TaskStatus.OPEN);
    }
}
