package com.hillel.webinar.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 */
@Embeddable
public class StudentAddress {

    @Getter
    @Setter
    @Column(name = "Country")
    private String country;

    @Getter
    @Setter
    @Column(name = "City")
    private String city;

    @Getter
    @Setter
    @Column(name = "StudentAddress")
    private String address;


    @Override
    public String toString() {
        return "StudentAddress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
