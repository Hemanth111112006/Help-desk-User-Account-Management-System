package com.examly.springapp.service;

import com.examly.springapp.model.UserRoleMapping;
import java.util.List;

public interface UserRoleMappingService {

    UserRoleMapping addUserRoleMapping(UserRoleMapping userRoleMapping);

    List<UserRoleMapping> getAllUserRoleMappings();

    UserRoleMapping getUserRoleMappingById(Long id);

    UserRoleMapping updateUserRoleMapping(Long id, UserRoleMapping userRoleMapping);

    List<UserRoleMapping> getUserRoleMappingsByUserId(Long userId);

    UserRoleMapping getUserRoleMappingByUserIdAndRoleId(Long userId, Long roleId);
}
