package com.examly.springapp.service;

import com.examly.springapp.model.AccountStatusLog;
import com.examly.springapp.repository.AccountStatusLogRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountStatusLogServiceImpl implements AccountStatusLogService {

    private final AccountStatusLogRepo repo;

    public AccountStatusLogServiceImpl(AccountStatusLogRepo repo) {
        this.repo = repo;
    }

    @Override
    public AccountStatusLog save(AccountStatusLog log) {
        return repo.save(log);
    }

    @Override
    public List<AccountStatusLog> getAll() {
        return repo.findAll();
    }
}
