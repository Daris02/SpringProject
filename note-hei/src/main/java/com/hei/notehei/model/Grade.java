package com.hei.notehei.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "GRADES")
public class Grade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGrade;

    @Column(nullable = false)
    private double average;

    @ManyToOne
    @JoinColumn(name = "student")
    private Student student;
    
    @ManyToOne
    @JoinColumn(name = "subject")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "examen")
    private Examen examen; 

}