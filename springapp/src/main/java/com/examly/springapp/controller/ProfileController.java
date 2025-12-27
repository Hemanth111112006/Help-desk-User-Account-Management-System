package com.examly.springapp.controller;

import com.examly.springapp.model.Profile;
import com.examly.springapp.service.ProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Profile createProfile(@RequestBody Profile profile) {
        return profileService.save(profile);
    }

    @GetMapping
    public List<Profile> getAllProfiles() {
        return profileService.getAll();
    }

    @GetMapping("/{id}")
    public Profile getProfileById(@PathVariable Long id) {
        return profileService.getById(id);
    }

    @PutMapping("/{id}")
    public Profile updateProfile(@PathVariable Long id,
                                 @RequestBody Profile profile) {
        return profileService.update(id, profile);
    }

    // JPQL Tests
    @GetMapping("/name/{name}")
    public List<Profile> getByName(@PathVariable String name) {
        return profileService.getByFirstName(name);
    }

    @GetMapping("/search/{name}/{address}")
    public List<Profile> searchByNameAndAddress(@PathVariable String name,
                                                 @PathVariable String address) {
        return profileService.getByFirstNameAndAddress(name, address);
    }
}
