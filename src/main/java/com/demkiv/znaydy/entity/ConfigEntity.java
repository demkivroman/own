package com.demkiv.znaydy.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Config")
public class ConfigEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private String value;
}
