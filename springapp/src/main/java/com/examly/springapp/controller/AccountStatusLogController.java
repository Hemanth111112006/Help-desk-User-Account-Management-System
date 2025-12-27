package com.examly.springapp.controller;

import com.examly.springapp.model.AccountStatusLog;
import com.examly.springapp.service.AccountStatusLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accountStatusLogs")
public class AccountStatusLogController {

    private final AccountStatusLogService service;

    public AccountStatusLogController(AccountStatusLogService service) {
        this.service = service;
    }

    @PostMapping
    public AccountStatusLog create(@RequestBody AccountStatusLog log) {
        return service.save(log);
    }

    @GetMapping
    public List<AccountStatusLog> getAll() {
        return service.getAll();
    }
}
