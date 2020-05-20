package setup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import model.City;
import model.CityDTO;
import repository.CityDTORepository;
import repository.CityRepository;
import service.ConvertService;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	CityRepository cityRepo;

	@Autowired
	CityDTORepository cityDTORepository;
	
	ConvertService service = new ConvertService();
	
	public void run(ApplicationArguments args) throws Exception {
		
		City sydney = new City("Sydney", 5);
		City melbourne = new City("Melbourne", 10);
		
		cityRepo.save(sydney);
		cityRepo.save(melbourne);

		/*
		 * Does Conversion to CITY to CITYDTO HERE
		 */
		List<City> cities = (List<City>) cityRepo.findAll();
		for (City city : cities) {
			CityDTO cityDTO = service.convertCityToCityDTO(city);
			cityDTORepository.save(cityDTO);
		}
	}

}
