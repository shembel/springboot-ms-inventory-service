package com.sig.microservices.inventoryservice.repository;

import com.sig.microservices.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    // turn on DEBUG to see query
    // whenever we execute this method it will execute the query and send us the response
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);
}
