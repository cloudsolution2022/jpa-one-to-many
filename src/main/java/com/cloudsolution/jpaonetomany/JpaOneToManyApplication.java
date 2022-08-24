package com.cloudsolution.jpaonetomany;

import com.cloudsolution.jpaonetomany.entity.User;
import com.cloudsolution.jpaonetomany.entity.Order;
import com.cloudsolution.jpaonetomany.entity.Product;
import com.cloudsolution.jpaonetomany.entity.ShippingAddress;
import com.cloudsolution.jpaonetomany.repository.OrderRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaOneToManyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =SpringApplication.run(JpaOneToManyApplication.class, args);
       OrderRepository orderRepository= configurableApplicationContext.getBean(OrderRepository.class);
       Order order= new Order();

        order.setOrderTotal(400);
        order.setName("Order-001");

        Product product1=new Product();
        Product product2=new Product();
        Product product3=new Product();
        Product product4=new Product();

        product1.setProduct_name("Media");
        product2.setProduct_name("Search");
        product3.setProduct_name("Display");
        product4.setProduct_name("Social");

        product1.setSerialNumber("MA01");
        product2.setSerialNumber("SA01");
        product3.setSerialNumber("DA01");
        product4.setSerialNumber("SO01");

        product1.setOrder(order);
        product2.setOrder(order);
        product3.setOrder(order);
        product4.setOrder(order);

        product1.setQty(2);
        product2.setQty(1);
        product3.setQty(3);
        product4.setQty(4);
        product1.setUnit_price(10);
        product2.setUnit_price(10);
        product3.setUnit_price(10);
        product4.setUnit_price(10);

        List<Product> productList=new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        User user = new User();
        user.setFName("Jay");
        user.setLName("Singh");
        user.setEmail("jaysingh04@yopmail.com");

        ShippingAddress shippingAddress=new ShippingAddress();
        shippingAddress.setAddress1("6330 Randi Ave");
        shippingAddress.setCity("Woodlanf Hills");
        shippingAddress.setZipCode(91367);
        user.setShippingAddress(shippingAddress);
        order.setUser(user);
        order.setProductList(productList);
        orderRepository.save(order);

    }

}
