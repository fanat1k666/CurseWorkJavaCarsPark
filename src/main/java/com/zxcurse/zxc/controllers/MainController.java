package com.zxcurse.zxc.controllers;

import com.zxcurse.zxc.models.Cars;
import com.zxcurse.zxc.repo.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private CarsRepository carsRepository;

    @GetMapping("/")
    public String home(Model model){
        Iterable<Cars> cars = carsRepository.findAll();
        model.addAttribute("cars", cars);
        return "main";
    }
    @GetMapping("/admin")
    public String admin(Model model){
        return "admin";
    }
    @PostMapping("/admin")
    public String carAdd(
            @RequestParam String title,
            @RequestParam String box,
            @RequestParam String strong,
            @RequestParam String privod,
            @RequestParam String year,
            @RequestParam String price,
            @RequestParam String img,
            Model model) {
        Cars cars = new Cars(title,box,strong,privod,year,price,img);
        carsRepository.save(cars);
        return "redirect:/";
    }
}