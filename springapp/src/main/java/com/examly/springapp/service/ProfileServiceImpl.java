package com.examly.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examly.springapp.model.Profile;
import com.examly.springapp.repository.ProfileRepo;

@Service
public class ProfileServiceImpl implements ProfileService {
    
    private final ProfileRepo profileRepo;

    public ProfileServiceImpl(ProfileRepo profileRepo) {
        this.profileRepo = profileRepo;
    }

    @Override
    public Profile save(Profile profile) {
        return profileRepo.save(profile);
    }

    @Override
    public List<Profile> getAll() {
        return profileRepo.findAll();
    }

    @Override
    public Profile getById(Long id) {
        return profileRepo.findById(id).orElse(null);
    }

    @Override
    public Profile update(Long id, Profile profile) {
        profile.setId(id);
        return profileRepo.save(profile);
    }

    @Override
    public List<Profile> getByFirstName(String name) {
        return profileRepo.findByFirstName(name);
    }

    @Override
    public List<Profile> getByFirstNameAndAddress(String name, String address) {
        return profileRepo.findByFirstNameAndAddress(name, address);
    }
}
