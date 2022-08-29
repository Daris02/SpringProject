package com.hei.notehei.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "SUBJECTS")
public class Subject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSubject;

    @Column(nullable = false, length = 50)
    private String name;

    @OneToMany
    private List<Grade> grade;
    
}