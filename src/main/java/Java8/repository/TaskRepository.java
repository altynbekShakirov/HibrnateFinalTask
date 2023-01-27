package Java8.repository;

import Java8.model.Task;

import java.util.List;

/**
 * The golden boy
 */
public interface TaskRepository {
    String saveTask(Task task);
    String updateTask(Long id, Task newTask);
    List<Task>getAllTaskByLessonId(Long lessonId);
    void deleteTaskById();
}
