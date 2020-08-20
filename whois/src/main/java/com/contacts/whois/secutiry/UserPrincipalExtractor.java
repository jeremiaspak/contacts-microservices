package com.contacts.whois.secutiry;

import com.contacts.whois.secutiry.model.User;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

import java.util.Map;

public class UserPrincipalExtractor implements PrincipalExtractor {

  @Override
  public Object extractPrincipal(Map<String, Object> map) {
    User user = new User();
    user.setId((Integer) map.get("id"));
    user.setName((String) map.get("name"));
    return user;
  }
}
