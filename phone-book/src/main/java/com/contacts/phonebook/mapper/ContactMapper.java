package com.contacts.phonebook.mapper;

import com.contacts.phonebook.dto.CreateContactRequest;
import com.contacts.phonebook.dto.CreateContactResponse;
import com.contacts.phonebook.dto.GetContactResponse;
import com.contacts.phonebook.entity.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContactMapper {

  ContactMapper INSTANTE = Mappers.getMapper(ContactMapper.class);

  GetContactResponse contactToGetContactResponse(Contact contact);
  Iterable<GetContactResponse> contactToGetContactResponse(Iterable<Contact> contacts);

  Contact createContactRequestToContact(CreateContactRequest contactRequest);
  CreateContactResponse contactToCreateContactResponse(Contact contact);
}
