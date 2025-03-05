package org.form.shopservice.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Vegetables", schema = "FMAP")
public class ShopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "MfgDate")
    private LocalDate mfgDate;

    @Column(name = "ExpiredDate")
    private LocalDate expiredDate;

    @Column(name = "IsActive", nullable = false)
    private boolean isActive;

    @Column(name = "CreatedDate", nullable = false)
    private LocalDate createdDate = LocalDate.now();

    @Column(name = "CreatedBy", nullable = false)
    private int createdBy;

    @Column(name = "ModifiedDate")
    private LocalDate modifiedDate;

    @Column(name = "ModifiedBy")
    private Integer modifiedBy;
}
