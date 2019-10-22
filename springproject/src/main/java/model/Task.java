package model;

import java.util.Objects;

public class Task {
    private Long taskId;
    private Long userId;
    private String taskName;
    private String status;

    public Task(Long taskId, Long userId, String taskName, String status) {
        this.userId = userId;
        this.taskName = taskName;
        this.taskId = taskId;
        this.status = status;
    }

    public Long getTask_id() {
        return taskId;
    }

    public void setTask_id(Long taskId) {
        this.taskId = taskId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(userId, task.userId) &&
                Objects.equals(taskName, task.taskName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userId, taskName);
    }
}
