package com.bankapp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entities.TransactionLog;

@Repository
public interface TrannsactionLogRepository extends JpaRepository<TransactionLog,Long> {

}
