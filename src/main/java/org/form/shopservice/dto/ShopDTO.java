package org.form.shopservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopDTO {

 private Long id;
 private String name;
 private LocalDate mfgDate;
 private LocalDate expiredDate;
 private boolean isActive;

}
