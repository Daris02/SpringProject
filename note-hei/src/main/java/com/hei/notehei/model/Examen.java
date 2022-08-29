package com.hei.notehei.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "EXAMENS")
public class Examen implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExamen;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false)     // CHECK DATE > new Date()
    private Date date_exam;
    
}
