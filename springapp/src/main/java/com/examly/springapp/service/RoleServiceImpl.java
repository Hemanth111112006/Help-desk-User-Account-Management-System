package com.examly.springapp.service;

import com.examly.springapp.model.Role;
import com.examly.springapp.repository.RoleRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepo roleRepo;

    public RoleServiceImpl(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    @Override
    public Role save(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public List<Role> getAll() {
        return roleRepo.findAll();
    }

    @Override
    public Role getById(Long id) {
        return roleRepo.findById(id).orElse(null);
    }

    @Override
    public Role update(Long id, Role role) {
        role.setId(id);
        return roleRepo.save(role);
    }

    @Override
    public void delete(Long id) {
        roleRepo.deleteById(id);
    }

    // ✅ Sorting REQUIRED for Day9_testPagination_SortingPresent
    @Override
    public Page<Role> getPaginated(int page, int size) {
        return roleRepo.findAll(
                PageRequest.of(page, size, Sort.by("id").ascending())
        );
    }
}
