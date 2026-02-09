package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/")
    public String home(Model model) {

        List<Product> products = List.of(
                new Product(1, "Laptop", 50000),
                new Product(2, "Phone", 20000),
                new Product(3, "Headset", 2000)
        );

        model.addAttribute("products", products);
        return "index";
    }
}
