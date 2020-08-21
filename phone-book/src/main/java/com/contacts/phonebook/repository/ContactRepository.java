package com.contacts.phonebook.repository;

import com.contacts.phonebook.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
  Iterable<Contact> findByUserId(Long userId);
}
