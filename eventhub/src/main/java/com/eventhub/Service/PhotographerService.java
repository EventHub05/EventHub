package com.eventhub.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eventhub.Entity.Photographer;
import com.eventhub.Repository.PhotographerRepository;

@Service
public class PhotographerService {

    @Autowired
    private PhotographerRepository photographerRepository;

    public List<Photographer> getAllPhotographers() {
        return photographerRepository.findAll();
    }

    public List<Photographer> saveAllPhotographers(List<Photographer> photographers) {
        return photographerRepository.saveAll(photographers);
    }
}




