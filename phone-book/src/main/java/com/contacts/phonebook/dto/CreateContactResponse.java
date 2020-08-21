package com.contacts.phonebook.dto;

public class CreateContactResponse {
  private Long id;

  private String name;

  private String phone;

  public String getName() {
    return name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
