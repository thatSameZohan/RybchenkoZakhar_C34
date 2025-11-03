package org.spring.rest.web;

import lombok.RequiredArgsConstructor;
import org.spring.rest.dto.ProfileDto;
import org.spring.rest.service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/profile")
public class ProfileController {

    private final ProfileService service;

    @GetMapping
    public ProfileDto getProfile(@RequestParam(name = "username") String name) {

        return service.getByUsername(name);
    }

    @GetMapping("/all")
    public List<ProfileDto> getAllProfiles() {

        return service.getAllProfiles();
    }

    @PostMapping
    public ResponseEntity<ProfileDto> saveProfile(@RequestBody ProfileDto dto) {

        var result= service.saveProfile(dto);
        return ResponseEntity.status(201).body(result);
    }

    @DeleteMapping
    public void deleteProfile(@RequestParam(name = "username") String name) {

        service.deleteProfile(name);
    }

    @PutMapping
    public ProfileDto updateProfile(@RequestParam(name = "username") String username, @RequestBody ProfileDto dto) {

        return service.updateProfile(username, dto);
    }
}
