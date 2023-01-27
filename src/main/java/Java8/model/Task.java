package Java8.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * The golden boy
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name ;
    @Column(name = "dead_line")
    private LocalDate deadLine;

    private String task;

}
