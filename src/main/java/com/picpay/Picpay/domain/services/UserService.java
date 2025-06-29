package com.picpay.Picpay.domain.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picpay.Picpay.domain.repositories.UserRepository;
import com.picpay.Picpay.domain.user.User;
import com.picpay.Picpay.domain.user.UserType;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender,
                                    BigDecimal amount)
                                    throws Exception {
        if(sender.getUserType() == UserType.MERCHANT) {
            throw new Exception("Usuário do tipo lojista não está autorizado a realizar transação!");
        }

        if(sender.getBalance().compareTo(amount) < 0) {
            throw new Exception("Usuário não tem saldo suficiente.");
        }
    }

    public User findUserById(Long id) throws Exception {
    return this.repository.findById(id)
            .orElseThrow(() -> new Exception("Usuário não encontrado!"));
}

    public void saveUser(User user) {
        this.repository.save(user);
    }
}
