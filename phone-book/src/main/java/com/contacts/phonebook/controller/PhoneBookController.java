package com.contacts.phonebook.controller;

import com.contacts.phonebook.dto.CreateContactRequest;
import com.contacts.phonebook.dto.CreateContactResponse;
import com.contacts.phonebook.dto.GetContactResponse;
import com.contacts.phonebook.entity.Contact;
import com.contacts.phonebook.mapper.ContactMapper;
import com.contacts.phonebook.secutiry.model.User;
import com.contacts.phonebook.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/contact")
public class PhoneBookController {

  @Autowired
  private ContactService contactService;

  @GetMapping
  public Iterable<GetContactResponse> findAll(@AuthenticationPrincipal User user) {
    return ContactMapper.INSTANTE.contactToGetContactResponse(
      contactService.findByUserId(user.getId().longValue())
    );
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public CreateContactResponse create(
    @Valid @RequestBody CreateContactRequest contactRequest,
    @AuthenticationPrincipal User user
    ) {
    Contact contact = ContactMapper.INSTANTE.createContactRequestToContact(contactRequest);
    contactService.create(contact, user.getId().longValue());
    return ContactMapper.INSTANTE.contactToCreateContactResponse(contact);
  }
}
