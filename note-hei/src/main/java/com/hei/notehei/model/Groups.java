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
@Entity(name = "groupes")
@Table(name = "GROUPES")
public class Groups implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGroup;

    @Column(length = 10)
    @NotEmpty(message = "Groupe name is not empty")
    @NotBlank(message = "Groupe name is not blank")
    private String name;

    @Column( length = 50)
    @NotEmpty(message = "Groupe is not empty")
    @NotBlank(message = "Group is not blank")
    private String groupe;

    @Transient
    @OneToMany(mappedBy = "groupes")
    private List<Student> student;
    
}