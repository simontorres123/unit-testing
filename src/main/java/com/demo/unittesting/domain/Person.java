package com.demo.unittesting.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PERSON")
public class Person implements Serializable {
    @Column(name = "name")
    @Id
    private String name;
    @Column(name = "lastname")
    private String lastName;

}
