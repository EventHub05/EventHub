package com.eventhub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.eventhub.Entity.Photographer;
import com.eventhub.Service.PhotographerService;

@RestController
@RequestMapping("/api/photographers")
public class PhotographerController {

    @Autowired
    private PhotographerService photographerService;

    @GetMapping
    public List<Photographer> getAllPhotographers() {
        return photographerService.getAllPhotographers();
    }

    @PostMapping
    public List<Photographer> addPhotographers(@RequestBody List<Photographer> photographers) {
        return photographerService.saveAllPhotographers(photographers);
    }
}

