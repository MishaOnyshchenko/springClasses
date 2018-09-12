package com.mvcTest5.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "student_task")
public class StudentTask {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
   private String task;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    public Student student;



    public StudentTask(String task, Student student){
        this.task = task;
        this.student = student;
    }
}
