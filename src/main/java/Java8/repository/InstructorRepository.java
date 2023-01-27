package Java8.repository;

import Java8.model.Course;
import Java8.model.Instructor;

/**
 * The golden boy
 */
public interface InstructorRepository {
    String saveInstructor(Instructor instructor);
    Instructor updateInstructor(Long id,Instructor newInstructor);
    Instructor getInstructorById(Long id);
    Instructor getInstructorByCourseId(Long courseId);
    void deleteInstructorById(Long id);
    String assignInstructor(Instructor instructor);



}
