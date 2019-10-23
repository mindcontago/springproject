package Repository;

import model.Task;
import model.TaskStatus;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public class TaskRepositoryImpl implements TaskRepository {
    @Override
    public void createTask(Long userId, String taskName) {

    }

    @Override
    public void deleteTask(Long taskId) {

    }

    @Override
    public Set<Task> findAllTasksByUser(Long userId) {
        return null;
    }

    @Override
    public void setStatus(Long taskId, TaskStatus taskStatus) {

    }
}
