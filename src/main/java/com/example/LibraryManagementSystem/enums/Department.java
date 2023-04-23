package com.example.LibraryManagementSystem.enums;

import com.example.LibraryManagementSystem.entity.Book;
import com.example.LibraryManagementSystem.entity.Card;
import com.example.LibraryManagementSystem.entity.TransactionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

public enum Department {

    CSE,
    IT,
    ECE,
    MECH,
    CIVIL,
    EEE,
    BIOTECH;

    @Entity
    @Table(name="transaction")
    @NoArgsConstructor
    @AllArgsConstructor
    @Setter
    @Getter
    public static class Transaction {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id;

        private String transactionNumber;

        @CreationTimestamp
        private Date transactionDate;

        private boolean isIssueOperation;

        @Enumerated(EnumType.STRING)
        private TransactionStatus transactionStatus;

        @ManyToOne
        @JoinColumn
        Card card;

        @ManyToOne
        @JoinColumn
        Book book;

    }
}
