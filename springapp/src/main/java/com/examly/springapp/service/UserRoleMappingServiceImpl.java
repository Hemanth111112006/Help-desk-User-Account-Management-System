package com.examly.springapp.service;

import com.examly.springapp.model.UserRoleMapping;
import com.examly.springapp.repository.UserRoleMappingRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleMappingServiceImpl implements UserRoleMappingService {

    @Autowired
    private UserRoleMappingRepo userRoleMappingRepository;

    @Override
    public UserRoleMapping addUserRoleMapping(UserRoleMapping userRoleMapping) {
        return userRoleMappingRepository.save(userRoleMapping);
    }

    @Override
    public List<UserRoleMapping> getAllUserRoleMappings() {
        return userRoleMappingRepository.findAll();
    }

    @Override
    public UserRoleMapping getUserRoleMappingById(Long id) {
        return userRoleMappingRepository.findById(id).orElse(null);
    }

    @Override
    public UserRoleMapping updateUserRoleMapping(Long id, UserRoleMapping userRoleMapping) {
        userRoleMapping.setId(id);
        return userRoleMappingRepository.save(userRoleMapping);
    }

    @Override
    public List<UserRoleMapping> getUserRoleMappingsByUserId(Long userId) {
        return userRoleMappingRepository.findByUserId(userId);
    }

    @Override
    public UserRoleMapping getUserRoleMappingByUserIdAndRoleId(Long userId, Long roleId) {
        return userRoleMappingRepository.findByUserIdAndRoleId(userId, roleId);
    }
}
