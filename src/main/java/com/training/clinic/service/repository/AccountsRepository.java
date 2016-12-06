package com.training.clinic.service.repository;

import com.training.clinic.entity.Account;

public interface AccountsRepository {

    Account saveAccount(Account account);

    Account getByNumberAccount(String sourceAccount);

    void updateAccount(Account account);

}
