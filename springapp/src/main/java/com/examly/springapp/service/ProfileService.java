package com.examly.springapp.service;

import com.examly.springapp.model.Profile;

import java.util.List;

public interface ProfileService {

    Profile save(Profile profile);

    List<Profile> getAll();

    Profile getById(Long id);

    Profile update(Long id, Profile profile);

    List<Profile> getByFirstName(String name);

    List<Profile> getByFirstNameAndAddress(String name, String address);
}
