package com.hei.notehei.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import lombok.*;

import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity(name = "students")
@Table(name = "STUDENTS")
public class Student implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;

    @Column(length = 100)
    @NotEmpty(message = "First name is not empty")
    @NotBlank(message = "First name is not blank")
    private String firstName;

    @Column(length = 100)
    @NotEmpty(message = "Last name is not empty")
    @NotBlank(message = "Last name is not blank")
    private String lastName;

    @Column(length = 150)
    @NotEmpty(message = "Email is not empty")
    @NotBlank(message = "Email name is not blank")
    private String email;

    @Column(length = 1)
    @NotEmpty(message = "Gender is not empty")
    @NotBlank(message = "Gender is not blank")
    private Character gender;

    @ManyToOne
    @JoinColumn(name = "groupes")
    @NonNull
    private Groups groupes;

    @Transient
    @OneToMany(mappedBy = "students")
    private List<Grade> grade;
    
}
