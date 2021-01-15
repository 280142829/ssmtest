package com.ssm.service.serviceImpl;

import com.ssm.dao.AccountDao;
import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> getAllAccount() {
        System.out.println("业务层调用：查询账户");
        List<Account> allAccount = accountDao.getAllAccount();
        return allAccount;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层调用：保存一个账户");
        accountDao.saveAccount(account);
    }
}
