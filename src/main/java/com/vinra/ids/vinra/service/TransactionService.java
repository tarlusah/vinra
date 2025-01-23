package com.vinra.ids.vinra.service;

import com.vinra.ids.vinra.entity.Transaction;
import com.vinra.ids.vinra.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository repository;


    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> getList(){
        return repository.findAll();
    }

}
