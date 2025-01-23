package com.vinra.ids.vinra.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(nullable = false, updatable = false)
    private String id;

    @Column(length = 255, nullable = false)
    private String name;
}
