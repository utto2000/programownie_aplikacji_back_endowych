package com.wodor.organizer.dao;

import com.wodor.organizer.model.Account;

import java.util.UUID;

public interface AccountDao {
    int insertAccount(UUID id, Account account);

        default int addAccount(Account account){
            UUID id = UUID.randomUUID();
            return insertAccount(id,account);

        }

}
