package com.eventhub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.eventhub.Entity.Catering;
import com.eventhub.Service.CateringService;

@RestController
@RequestMapping("/api/catering")
public class CateringController {

    @Autowired
    private CateringService cateringService;
    
    @GetMapping
    public List<Catering> getAllCatering() {
        return cateringService.getAllCatering();
    }

    @PostMapping
    public List<Catering> addCatering(@RequestBody List<Catering> catering) {
        return cateringService.saveAll(catering);
    }
}

