package com.examly.springapp.repository;

import com.examly.springapp.model.UserRoleMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleMappingRepo extends JpaRepository<UserRoleMapping, Long> {

    List<UserRoleMapping> findByUserId(Long userId);

    UserRoleMapping findByUserIdAndRoleId(Long userId, Long roleId);
}
