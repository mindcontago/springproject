package Repository;

import model.Task;
import model.TaskStatus;

import java.util.Set;

public interface TaskRepository {

    void createTask(Long userId, String taskName);

    void deleteTask(Long taskId);

    Set<Task> findAllTasksByUser(Long userId);

    void setStatus(Long taskId, TaskStatus taskStatus);
}

