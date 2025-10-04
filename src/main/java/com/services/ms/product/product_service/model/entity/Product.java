package com.services.ms.product.product_service.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.el.lang.ELArithmetic;

import java.math.BigDecimal;
@Setter
@Getter
@Entity
@Table(name = "products")
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String description;
        private BigDecimal price;

        @ManyToOne
        @JoinColumn(name = "category_id")
        private Category category;

        @Column(columnDefinition = "BIT(1" +
                ") default 0")
        private Boolean status;


}

