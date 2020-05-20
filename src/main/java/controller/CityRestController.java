package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.City;
import model.CityDTO;
import repository.CityDTORepository;
import repository.CityRepository;

@RestController()
@RequestMapping("/api")
public class CityRestController {

	@Autowired
	CityRepository cityRepository;

	@Autowired
	CityDTORepository cityDTORepository;

//	ConvertService service = new ConvertService();

	@GetMapping("cities")
	public List<City> getCities() {
		return (List<City>) cityRepository.findAll();
	}

	@GetMapping("citiesDTO")
	public List<CityDTO> getCitiesDTO() {
//		List<City> cities = getCities();
//		for (City city : cities) {
//			CityDTO cityDTO = service.convertCityToCityDTO(city);
//			cityDTORepository.save(cityDTO);
//		}
		return (List<CityDTO>) cityDTORepository.findAll();
	}
}
