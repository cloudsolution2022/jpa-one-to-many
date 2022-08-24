package com.cloudsolution.jpaonetomany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="USER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String fName;
    private String lName;
    private String email;
    @OneToOne
    private ShippingAddress shippingAddress;

   /* @OneToMany(mappedBy = "contact",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<Order> orders=new ArrayList<Order>();
*/
}
