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
                new Product("Mobile Phone", "₹15,000"),
                new Product("Laptop", "₹55,000"),
                new Product("Headphones", "₹2,000")
        );

        model.addAttribute("products", products);
        return "index";
    }
}
