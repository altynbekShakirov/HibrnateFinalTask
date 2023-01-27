package Java8.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The golden boy
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  Long id;
    private String name;
    @Column(name = "video_link")
     private  String videoLink;
    @ManyToOne
     private Course course;
       @OneToMany
    private List<Task>tasks;



}
