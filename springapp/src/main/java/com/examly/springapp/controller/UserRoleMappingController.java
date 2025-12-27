package com.examly.springapp.controller;

import com.examly.springapp.model.UserRoleMapping;
import com.examly.springapp.service.UserRoleMappingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userRoleMappings")
public class UserRoleMappingController {

    @Autowired
    private UserRoleMappingService userRoleMappingService;

    // ✅ FIXED: Day10_testAddUserRoleMapping (expects 201 CREATED)
    @PostMapping
    public ResponseEntity<UserRoleMapping> addUserRoleMapping(
            @RequestBody UserRoleMapping userRoleMapping) {

        UserRoleMapping saved =
                userRoleMappingService.addUserRoleMapping(userRoleMapping);

        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    // ✅ Day10_testGetAllUserRoleMappings
    @GetMapping
    public List<UserRoleMapping> getAllUserRoleMappings() {
        return userRoleMappingService.getAllUserRoleMappings();
    }

    // ✅ Day10_testGetUserRoleMappingById
    @GetMapping("/{id}")
    public UserRoleMapping getUserRoleMappingById(
            @PathVariable Long id) {
        return userRoleMappingService.getUserRoleMappingById(id);
    }

    // ✅ Day10_testUpdateUserRoleMapping
    @PutMapping("/{id}")
    public UserRoleMapping updateUserRoleMapping(
            @PathVariable Long id,
            @RequestBody UserRoleMapping userRoleMapping) {

        return userRoleMappingService.updateUserRoleMapping(id, userRoleMapping);
    }

    // ✅ Day11 + Day12 (204 No Content)
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<UserRoleMapping>> getByUserId(
            @PathVariable Long userId) {

        List<UserRoleMapping> list =
                userRoleMappingService.getUserRoleMappingsByUserId(userId);

        if (list == null || list.isEmpty()) {
            return ResponseEntity.noContent().build(); // 204
        }

        return ResponseEntity.ok(list); // 200
    }

    // ✅ Day12_testGetUserRoleMappingByUserIdAndRoleId
    @GetMapping("/user/{userId}/role/{roleId}")
    public UserRoleMapping getByUserIdAndRoleId(
            @PathVariable Long userId,
            @PathVariable Long roleId) {

        return userRoleMappingService
                .getUserRoleMappingByUserIdAndRoleId(userId, roleId);
    }
}
