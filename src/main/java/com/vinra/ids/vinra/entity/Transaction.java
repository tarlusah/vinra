package com.vinra.ids.vinra.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Setter
@Getter
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @Column(nullable = false, updatable = false)
    private Integer id;


    private BigDecimal amount;

    private Integer status;

    private Instant transactionDate;

    private String createBy;


    @Embedded
    private AuditFields auditFields;


    //relationship

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;





}


