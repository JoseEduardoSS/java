package com.jose.db_connection.dto;

import com.jose.db_connection.domain.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private UUID id;

    private String name;

    private String description;

    private BigDecimal price;

    private Date insertDate;

    public Product(ProductEntity entity) {
        setId(entity.getId());
        setName(entity.getName());
        setDescription(entity.getDescription());
        setPrice(entity.getPrice());
        setInsertDate(entity.getInsertDate());
    }
}
