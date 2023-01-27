package Java8.repository;

import Java8.model.Lesson;

/**
 * The golden boy
 */
public interface LessonRepository {
    String saveLesson(Lesson lesson);
    String updateLesson(Long id, Lesson newLesson);
    Lesson getLessonById(Long id );
    Lesson getLessonByCourseId(Long courseId);

}
