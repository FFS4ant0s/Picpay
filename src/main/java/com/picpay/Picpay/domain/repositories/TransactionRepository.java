package com.picpay.Picpay.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpay.Picpay.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
