package com.talkactive.tacurrentuser.userDetails;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class UserDetailsResource {

    private UserDetailsService userDetailsService;

    public UserDetailsResource(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @GetMapping("/user-details")
    public ResponseEntity<UserDetails> getUserDetails(Principal principal) {
        UserDetails response = userDetailsService.getUserDetails(principal);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}