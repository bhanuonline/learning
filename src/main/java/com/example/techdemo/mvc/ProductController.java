package com.example.techdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * http://localhost:8080/productForm.
 */
@Controller
public class ProductController {

    // Mock service for demonstration
    private final ProductService productService = new ProductService();

    @GetMapping("/productForm")
    public String showProductForm(Model model) {
        System.out.println("showProductForm");
        // Add an empty product object for the form
        model.addAttribute("product", new Product());
        return "productForm";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        // Save the product (mock implementation)
        Product savedProduct = productService.save(product);

        // Add a flash attribute for a success message
        redirectAttributes.addFlashAttribute("message", "Product saved successfully!");

        // Add the product ID as a query parameter
        redirectAttributes.addAttribute("id", savedProduct.getId());

        // Redirect to the details page
        return "redirect:/productDetails";
    }

    @GetMapping("/productDetails")
    public String showProductDetails(@ModelAttribute("id") Long id, Model model) {
        // Retrieve the product details by ID
        Product product = productService.findById(id);

        // Add the product to the model
        model.addAttribute("product", product);

        // Render the product details page
        return "productDetails";
    }
}
