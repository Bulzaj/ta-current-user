package com.talkactive.tacurrentuser.userDetails;

import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
public interface UserDetailsService {

    UserDetails getUserDetails(Principal principal);
}
