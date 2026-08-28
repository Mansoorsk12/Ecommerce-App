package com.mansoor.ecommerce.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity @Table(name="products")
public class Product {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  @NotBlank private String name;
  private String description;
  @Positive private double price;
  private String category;
  private String imageUrl;
  public Product() {}
  public Product(String name,String description,double price,String category,String imageUrl){this.name=name;this.description=description;this.price=price;this.category=category;this.imageUrl=imageUrl;}
  public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;} public double getPrice(){return price;} public void setPrice(double v){price=v;} public String getCategory(){return category;} public void setCategory(String v){category=v;} public String getImageUrl(){return imageUrl;} public void setImageUrl(String v){imageUrl=v;}
}
