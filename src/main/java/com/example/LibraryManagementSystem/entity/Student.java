package com.example.LibraryManagementSystem.entity;

import com.example.LibraryManagementSystem.enums.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="student")// DBMS Table Name
@NoArgsConstructor//by lombok
@AllArgsConstructor
@Setter
@Getter
public class Student {

    @Id   //primary key denotes
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto generate  P.K
    private int id;
    private String name;
    private int age;

    //By ENUM CLASS
    @Enumerated(EnumType.STRING)// If not write @Enumerated then DBMS not understand .Therefor,I write
    //Default is Ordinal
    private Department department;

    private String mobNo;

    @OneToOne(mappedBy = "student",cascade=CascadeType.ALL)
    Card card;
}
