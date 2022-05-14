package com.wodor.organizer.dao;

import com.wodor.organizer.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakeAccountDataAccessService implements AccountDao{

    private static List<Account> DB = new ArrayList<>();
    @Override
    public int insertAccount(UUID id, Account account) {
        return 0;
    }
}
