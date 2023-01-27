package Java8.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

/**
 * The golden boy
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "course_name")
    private String courseName;
    private int duration;
    @Column(name = "create_at")
    private LocalDate createAt;
    @Column(name = "image_link")
    private String imageLink;
    private String description;
    @ManyToMany
    private List<Instructor>instructors;

    public Course(String courseName, int duration, LocalDate createAt, String imageLink, String description) {
        this.courseName = courseName;
        this.duration = duration;
        this.createAt = createAt;
        this.imageLink = imageLink;
        this.description = description;
    }
}