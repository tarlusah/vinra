package com.vinra.ids.vinra.controller;


import com.vinra.ids.vinra.controller.dto.TransactionResponse;
import com.vinra.ids.vinra.controller.mapper.TransactionDTOMapper;
import com.vinra.ids.vinra.enums.TransactionStatus;
import com.vinra.ids.vinra.service.TransactionService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "v1/transactions", produces = MediaType.APPLICATION_JSON_VALUE)
public class TransactionController {

    private final TransactionService service;
    private final TransactionDTOMapper transactionDTOMapper;

    public TransactionController(TransactionService service, TransactionDTOMapper transactionDTOMapper) {
        this.service = service;
        this.transactionDTOMapper = transactionDTOMapper;
    }

    @GetMapping
    public ResponseEntity<TransactionResponse> transactionList(){

        return ResponseEntity.ok(
                TransactionResponse.builder().data(
                            service.getList().stream().map(transactionDTOMapper::toDto).toList()
                        )
                        .status(TransactionStatus.getStatuses()).build()
        );
    }

}
