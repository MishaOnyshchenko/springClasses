package com.mvcTest3.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "stud")

public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private String phone;

    @Column (name = "age_my")
    private String ageMy;

    public Student(String name, String phone, String ageMy) {
        this.name = name;
        this.phone = phone;
        this.ageMy = ageMy;
    }
}