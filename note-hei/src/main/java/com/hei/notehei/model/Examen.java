package com.hei.notehei.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity(name = "examen")
@Table(name = "EXAMEN")
public class Examen implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExamen;

    @Column(length = 50)
    private String title;

    @Column     // CHECK DATE > new Date()
    private Date date_exam;

    @Transient
    @OneToMany(mappedBy = "examen")
    private List<Grade> grade;
    
}
