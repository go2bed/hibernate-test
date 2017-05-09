package com.hillel.webinar.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "SUBJECTS")
public class Subject extends AbstractEntity {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Column(name = "Name")
    private String name;

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
