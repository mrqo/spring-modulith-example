package org.example.ecommmodulith.inventory;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class InventoryEntry {
    @Id
    private Long id;
}
