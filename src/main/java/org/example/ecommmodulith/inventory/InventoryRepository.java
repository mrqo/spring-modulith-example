package org.example.ecommmodulith.inventory;

import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<InventoryEntry, Long> {
}
