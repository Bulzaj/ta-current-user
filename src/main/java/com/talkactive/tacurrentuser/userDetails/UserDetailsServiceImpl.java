package com.talkactive.tacurrentuser.userDetails;


import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails getUserDetails(Principal principal){
        return new UserDetails(principal.getName());
    }
}
