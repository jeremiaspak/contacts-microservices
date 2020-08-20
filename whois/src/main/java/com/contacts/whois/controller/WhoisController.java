package com.contacts.whois.controller;

import com.contacts.whois.secutiry.model.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/whois")
public class WhoisController {

  @GetMapping("/principal")
  public User getPrincipal(@AuthenticationPrincipal User user) {
    return user;
  }
}
