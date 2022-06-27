package com.team7.question.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "presenters")
public class Presenter {

    @Id
    @GeneratedValue
    private int id;

    private String name;
}
