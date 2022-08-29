package com.hei.notehei.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "GROUPS")
public class Group implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGroup;

    @Column(nullable = false, length = 2)
    private String name;

    @Column( length = 50)
    private String groupe;

    /* 
    @OneToMany
    private List<Student> students;
    */
}