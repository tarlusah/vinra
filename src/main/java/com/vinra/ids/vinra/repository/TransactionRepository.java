package com.vinra.ids.vinra.repository;

import com.vinra.ids.vinra.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
