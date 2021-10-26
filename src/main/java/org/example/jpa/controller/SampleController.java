package org.example.jpa.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.jpa.model.UserEntity;
import org.example.jpa.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Vivek
 * @since 24/10/21
 */
@Slf4j
@RestController
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    SampleRepository sampleRepository;

    @GetMapping("/create")
    public String create(@RequestParam String email,
                         @RequestParam String firstName,
                         @RequestParam String secondName,
                         @RequestParam long mobile) {
        log.info("Rx req for {}", email);
        UserEntity userEntity = sampleRepository.save(new UserEntity(email, firstName, secondName, mobile));
        log.info("Generated and saved: {}", userEntity);
        return userEntity.toString();
    }

    @GetMapping("/update/mobile")
    public int updateUser(@RequestParam String email,
                          @RequestParam long mobile) {
        return sampleRepository.updateMobile(mobile, email);
    }

    @GetMapping("/get/mobile")
    public long getMobile(@RequestParam String email) {
        return sampleRepository.retrieveMobile(email);
    }

    @GetMapping("/get/firstname/{email}")
    public String getfirstName(@RequestParam("email") String email) {
        return sampleRepository.getUserEntity(email).getFirstName();
    }
}