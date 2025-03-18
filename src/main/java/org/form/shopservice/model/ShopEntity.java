package org.form.shopservice.model;

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

/**
 * Entity class showing a vegetable details in the shop.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Vegetables", schema = "dbo")
public class ShopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    /**
     * The name of the vegetable.
     * It Cannot be null.
     */
    @Column(name = "Name", nullable = false)
    private String name;

    /**
     * The manufacturing date of the vegetable.
     */
    @Column(name = "MfgDate")
    private LocalDate mfgDate;

    /**
     * The expiration date of the vegetable.
     */
    @Column(name = "ExpiredDate")
    private LocalDate expiredDate;

    /**
     * It shows that whether the vegetable entry is active.
     * It Cannot be null.
     */
    @Column(name = "IsActive", nullable = false)
    private boolean isActive;

    /**
     * It shows the date of the vegetable created
     */
    @Column(name = "CreatedDate", nullable = false)
    private LocalDate createdDate = LocalDate.now();

    /**
     * It shows the name who created/added that vegetable details
     */
    @Column(name = "CreatedBy", nullable = false)
    private int createdBy;

    /**
     * It shows the date when the vegetable was modified.
     */
    @Column(name = "ModifiedDate")
    private LocalDate modifiedDate;

    /**
     * It shows that who modified this vegetable details.
     */
    @Column(name = "ModifiedBy")
    private Integer modifiedBy;
}
