package com.hei.notehei.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity(name = "groups")
@Table(name = "GROUPS")
public class Groups implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGroup;

    @Column(nullable = false, length = 10)
    private String name;

    @Column( length = 50)
    private String groupe;

    @Transient
    @OneToMany(mappedBy = "groups")
    private List<Student> student;
    
}