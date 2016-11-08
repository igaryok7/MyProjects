package ua.lviv.lgs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.lgs.entity.Products;
import ua.lviv.lgs.services.ProductsService;

import java.util.List;

/**
 * Created by Igaryok on 09.07.2016.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductsService productsService;

    @RequestMapping (value = "/allProducts", method = RequestMethod.GET)
    private String productsAll(Model model){
        List<Products> productsList = productsService.findAll();
        model.addAttribute("products", productsList);
        return "products-all";
    }

    @RequestMapping(value = "/productNew", method = RequestMethod.GET)
    private String productNew(){
        return "products-new";
    }

    @RequestMapping(value = "createProduct", method = RequestMethod.POST)
    private String createNewProduct(@RequestParam("brand")String brand){
        productsService.add(brand);
        return "redirect:/allProducts";
    }

    @RequestMapping(value = "/products={id}", method = RequestMethod.GET)
    private String productsInfo(Model model, @PathVariable String id){
        Products products = productsService.finById(Integer.parseInt(id));
        model.addAttribute("products", products);
        return "products-page";
    }

}
