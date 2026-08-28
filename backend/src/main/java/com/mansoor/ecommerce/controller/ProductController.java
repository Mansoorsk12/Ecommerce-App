package com.mansoor.ecommerce.controller;
import com.mansoor.ecommerce.model.Product;
import com.mansoor.ecommerce.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/products") @CrossOrigin(origins="http://localhost:5173")
public class ProductController {
  private final ProductRepository repo; public ProductController(ProductRepository repo){this.repo=repo;}
  @GetMapping public List<Product> all(@RequestParam(required=false) String search,@RequestParam(required=false) String category){
    if(search!=null&&!search.isBlank()) return repo.findByNameContainingIgnoreCase(search);
    if(category!=null&&!category.isBlank()&&!category.equalsIgnoreCase("All")) return repo.findByCategoryIgnoreCase(category);
    return repo.findAll();
  }
  @GetMapping("/{id}") public Product one(@PathVariable Long id){return repo.findById(id).orElseThrow();}
  @PostMapping public Product create(@RequestBody Product p){return repo.save(p);}
  @PutMapping("/{id}") public Product update(@PathVariable Long id,@RequestBody Product p){Product x=repo.findById(id).orElseThrow();x.setName(p.getName());x.setDescription(p.getDescription());x.setPrice(p.getPrice());x.setCategory(p.getCategory());x.setImageUrl(p.getImageUrl());return repo.save(x);}
  @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
