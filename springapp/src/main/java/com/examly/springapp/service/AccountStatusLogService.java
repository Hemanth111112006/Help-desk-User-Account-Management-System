package com.examly.springapp.service;

import com.examly.springapp.model.AccountStatusLog;

import java.util.List;

public interface AccountStatusLogService {

    AccountStatusLog save(AccountStatusLog log);

    List<AccountStatusLog> getAll();
}
