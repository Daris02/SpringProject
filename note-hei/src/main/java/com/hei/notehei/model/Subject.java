package com.hei.notehei.model;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotBlank;

import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity(name = "subjects")
@Table(name = "SUBJECTS")
public class Subject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSubject;

    @Column(length = 50)
    @NotEmpty(message = "Name subject is not empty")
    @NotBlank(message = "Name subject is not blank")
    private String name;
    
    @Transient
    @OneToMany(mappedBy = "subject")
    private List<Grade> grade;
}
