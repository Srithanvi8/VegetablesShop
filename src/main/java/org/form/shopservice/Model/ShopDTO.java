package org.form.shopservice.Model;

import java.time.LocalDate;

public class ShopDTO {

 private Long id;
 private String name;
 private LocalDate mfgDate;
 private LocalDate expiredDate;
 private boolean isActive;

 public ShopDTO(Long id, String name, LocalDate mfgDate, LocalDate expiredDate, boolean isActive) {
  this.id = id;
  this.name = name;
  this.mfgDate = mfgDate;
  this.expiredDate = expiredDate;
  this.isActive = isActive;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public LocalDate getMfgDate() {
  return mfgDate;
 }

 public void setMfgDate(LocalDate mfgDate) {
  this.mfgDate = mfgDate;
 }

 public LocalDate getExpiredDate() {
  return expiredDate;
 }

 public void setExpiredDate(LocalDate expiredDate) {
  this.expiredDate = expiredDate;
 }

 public boolean isActive() {
  return isActive;
 }

 public void setActive(boolean active) {
  isActive = active;
 }
}
