package com.examly.springapp.service;

import com.examly.springapp.model.Role;
import org.springframework.data.domain.Page;

import java.util.List;

public interface RoleService {

    Role save(Role role);

    List<Role> getAll();

    Role getById(Long id);

    Role update(Long id, Role role);

    void delete(Long id);

    Page<Role> getPaginated(int page, int size);
}
