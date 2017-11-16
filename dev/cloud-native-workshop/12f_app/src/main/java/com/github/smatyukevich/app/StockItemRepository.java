package com.github.smatyukevich.app;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.github.smatyukevich.app.domain.model.ItemType;
import com.github.smatyukevich.app.domain.model.StockItem;

public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}