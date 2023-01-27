package Java8.repository;

import Java8.model.Course;

import java.util.List;

/**
 * The golden boy
 */
public interface CourseRepository {
    String saveCourse(Course course);
    Course getCourseById(Long id);
    List<Course>getAllCourse();
    Course updateCourse(Long id, Course newCourse);
    void deleteCourseById(Long id);
    Course getCourseById();




}
