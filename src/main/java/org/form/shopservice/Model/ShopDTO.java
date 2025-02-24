package org.form.shopservice.Model;

import java.time.LocalDate;

public class ShopDTO {
 private Long id;
 private String firstname;
 private String lastname;
 private LocalDate dateofbirth;

 // Getters and Setters
 public Long getId() { return id; }
 public void setId(Long id) { this.id = id; }
 public String getFirstname() { return firstname; }
 public void setFirstname(String firstname) { this.firstname = firstname; }
 public String getLastname() { return lastname; }
 public void setLastname(String lastname) { this.lastname = lastname; }
 public LocalDate getDateofbirth() { return dateofbirth; }
 public void setDateofbirth(LocalDate dateofbirth) { this.dateofbirth = dateofbirth; }
}
