package com.cloudsolution.jpaonetomany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT_TB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String product_name;
    private Integer qty;
    private double unit_price;
    private  String serialNumber;
    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

}
