package com.demo.unittesting.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "PERSON")
public class Person implements Serializable {
    @Column(name = "name")
    @Id
    private String name;
    @Column(name = "lastname")
    private String lastName;

}
