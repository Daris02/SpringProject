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
@Entity(name = "subjects")
@Table(name = "SUBJECTS")
public class Subject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSubject;

    @Column(length = 50)
    @NonNull
    private String name;
    
    @Transient
    @OneToMany(mappedBy = "subject")
    private List<Grade> grade;
}
