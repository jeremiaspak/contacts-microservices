package com.contacts.phonebook.service;

import com.contacts.phonebook.ContactNotFoundException;
import com.contacts.phonebook.entity.Contact;
import com.contacts.phonebook.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

  @Autowired
  private ContactRepository repository;

  public Iterable<Contact> findAll() {
    return repository.findAll();
  }

  public Iterable<Contact> findByUserId(Long userId) {
    return repository.findByUserId(userId);
  }

  public Contact getById(Long id) {
    return repository.findById(id).orElseThrow(ContactNotFoundException::new);
  }

  public Contact create(Contact contact, Long userId) {
    contact.setUserId(userId);
    return repository.save(contact);
  }
}
