package com.vinra.ids.vinra.controller.dto;

import com.vinra.ids.vinra.enums.TransactionStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class TransactionResponse {

    private List<TransactionDTO> data;
    private List<TransactionStatus.TransactionStatusDTO> status;
}
