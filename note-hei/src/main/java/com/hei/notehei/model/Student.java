package com.hei.notehei.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity(name = "students")
@Table(name = "STUDENTS")
public class Student implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;

    @Column(nullable = false, length = 100)
    @NonNull
    private String firstName;

    @Column(nullable = false, length = 100)
    @NonNull
    private String lastName;

    @Column(nullable = false, length = 150)
    @NonNull
    private String email;

    @Column(length = 1)
    private Character gender;

    @ManyToOne
    @JoinColumn(name = "groups")
    @NonNull
    private Groups groups;
    
}
