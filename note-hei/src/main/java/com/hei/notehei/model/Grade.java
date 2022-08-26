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
@Table
public class Grade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGrade;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false)
    private String average;

    @ManyToOne
    @JoinColumn(name = "id")
    private Student student;

}