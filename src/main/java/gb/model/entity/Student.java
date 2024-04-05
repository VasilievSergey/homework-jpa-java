package gb.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity(name = "student")
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    @Column()
    private Integer id;

    @Column()
    private String firstName;

    @Column()
    private String secondName;

    @Column()
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}