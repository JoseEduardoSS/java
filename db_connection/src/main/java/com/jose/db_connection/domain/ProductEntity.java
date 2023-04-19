package com.jose.db_connection.domain;


import com.jose.db_connection.dto.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "insert_date")
    @CreationTimestamp
    private Date insertDate;

    public ProductEntity(Product dto) {
        setName(dto.getName());
        setDescription(dto.getDescription());
        setPrice(dto.getPrice());
    }

}
