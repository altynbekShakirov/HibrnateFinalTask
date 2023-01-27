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
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    @Column(name = "firs_name")
    private  String firsName;
    @Column(name = "last_name")

    private String lastName;
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @ManyToMany(mappedBy = "courses")
    private List<Course>courses;

    public Instructor(String firsName, String lastName, String email, String phoneNumber) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
