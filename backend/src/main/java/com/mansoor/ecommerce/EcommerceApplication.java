package com.mansoor.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.mansoor.ecommerce.model.Product;
import com.mansoor.ecommerce.repository.ProductRepository;

@SpringBootApplication
public class EcommerceApplication {
  public static void main(String[] args) { SpringApplication.run(EcommerceApplication.class, args); }
  @Bean CommandLineRunner seed(ProductRepository repo) { return args -> {
    if (repo.count() == 0) {
      repo.save(new Product("Laptop", "Performance laptop for work and study", 55000, "Electronics", "https://images.unsplash.com/photo-1496181133206-80ce9b88a853?w=800"));
      repo.save(new Product("Headphones", "Wireless over-ear headphones", 1500, "Electronics", "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=800"));
      repo.save(new Product("Keyboard", "Mechanical keyboard", 800, "Accessories", "https://images.unsplash.com/photo-1587829741301-dc798b83add3?w=800"));
      repo.save(new Product("Smartwatch", "Smart fitness watch", 3200, "Wearables", "https://images.unsplash.com/photo-1523275335684-37898b6baf30?w=800"));
      repo.save(new Product("Mouse", "Ergonomic wireless mouse", 999, "Accessories", "https://images.unsplash.com/photo-1527814050087-3793815479db?w=800"));
      repo.save(new Product("Monitor", "24-inch full HD monitor", 8999, "Electronics", "https://images.unsplash.com/photo-1527443224154-c4a3942d3acf?w=800"));
    }
  }; }
}
