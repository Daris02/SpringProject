package com.hei.notehei.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity(name = "grades")
@Table(name = "GRADES")
public class Grade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGrade;

    @Column
    @NonNull
    private Double average;

    @ManyToOne
    @JoinColumn(name = "student")
    @NonNull
    private Student student;
    
    @ManyToOne
    @JoinColumn(name = "subject")
    @NonNull
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "examen")
    @NonNull
    private Examen examen; 

}