package com.picpay.Picpay.domain.transaction;

import java.math.BigDecimal;

import com.picpay.Picpay.domain.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name="transactions")
@Table(name="transactions")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @ManyToOne
    private User sender;

}
