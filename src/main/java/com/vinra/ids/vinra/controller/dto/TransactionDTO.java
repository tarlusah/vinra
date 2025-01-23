package com.vinra.ids.vinra.controller.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Setter
@Getter
public class TransactionDTO {

    private Integer id;

    private String productID;
    private String productName;

    private String customerName;


    private BigDecimal amount;

    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime transactionDate;

    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createOn;


    public void setTransactionDate(Instant transactionDate) {
        this.transactionDate = transactionDate != null
                ? LocalDateTime.ofInstant(transactionDate, ZoneId.systemDefault())
                : null;
    }

    public void setCreateOn(Instant createOn) {
        this.createOn = createOn != null
                ? LocalDateTime.ofInstant(createOn, ZoneId.systemDefault())
                : null;
    }

}
