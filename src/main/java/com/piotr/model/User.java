package com.piotr.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jalos on 22.04.2016.
 */

@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "department")
    private String department;


    @Column(name = "position")
    private String position;


    @OneToMany(mappedBy = "user")
    private List<Result> results;

    @OneToMany(mappedBy = "user") // z reguly nazwa klasy .
    private List<Survey> surveys;


}
// pozycje wypisujemy jako wartosc konkretna staff ,, itd
