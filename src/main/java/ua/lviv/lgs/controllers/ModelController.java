package ua.lviv.lgs.controllers;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.lgs.entity.Products;
import ua.lviv.lgs.services.ModelsService;
import ua.lviv.lgs.services.ProductsService;

import java.util.List;

/**
 * Created by Igaryok on 28.07.2016.
 */
@Controller
public class ModelController {

    @Autowired
    private ModelsService modelsService;

    @Autowired
    private ProductsService productsService;

    @RequestMapping(value = "/createModel" , method = RequestMethod.GET)
    public String addModel(Model model){
        List<Products> productsList = productsService.findAll();
        model.addAttribute("products", productsList);
        return "models-new";
    }

    @RequestMapping(value = "/createModel", method = RequestMethod.POST)
    public String createModels(@RequestParam ("model")String model, @RequestParam ("memory")Integer memory, @RequestParam("price")Integer price, @RequestParam("products")String id){
        modelsService.add(model, memory, price, id);
        return "redirect:/";
    }

    @RequestMapping(value = "/allModels", method = RequestMethod.GET)
    public String allModels(Model model){
        model.addAttribute("models", modelsService.findAllModels());
        return "models-all";
    }
}
