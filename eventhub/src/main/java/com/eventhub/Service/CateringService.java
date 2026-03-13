package com.eventhub.Service;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import java.util.List;
	import com.eventhub.Entity.Catering;
	import com.eventhub.Repository.CateringRepository;

	@Service
	public class CateringService {

	    @Autowired
	    private CateringRepository cateringRepository;

	    public List<Catering> getAllCatering() {
	        return cateringRepository.findAll();
	    }

	    public Catering addCatering(Catering catering) {
	        return cateringRepository.save(catering);
	    }
	    public List<Catering> saveAll(List<Catering> catering){
	        return cateringRepository.saveAll(catering);
	    }
	    
	   
	}


