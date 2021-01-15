package com.ssm.service;

import com.ssm.domain.Account;

import java.util.List;

public interface AccountService {
    public List<Account> getAllAccount();
    public void saveAccount(Account account);
}
