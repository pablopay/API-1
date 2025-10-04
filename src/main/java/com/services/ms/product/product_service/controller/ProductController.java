package com.services.ms.product.product_service.controller;

import com.services.ms.product.product_service.model.dto.CreateProductRequest;
import com.services.ms.product.product_service.model.dto.ProductResponse;
import com.services.ms.product.product_service.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<ProductResponse> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductResponse findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping("/category/{categoryId}")
    public List<ProductResponse> findAllByCategoryId(@PathVariable Long categoryId){
        return productService.findAllByCategoryId(categoryId);
        }

    @PostMapping
    public ResponseEntity<ProductResponse> save(@Valid @RequestBody CreateProductRequest request) {
        ProductResponse response = productService.save(request);
        return ResponseEntity.created(URI.create("/api/products/" + response.getId()))
                .body(response);
    }


    @PutMapping("{id}")
    public ProductResponse update(
            @PathVariable Long id, @Valid @RequestBody CreateProductRequest request)
        {
            return productService.update(id, request);
        }

        @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){
        productService.deleteById(id);
        }
}
