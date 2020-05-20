package service;

import model.City;
import model.CityDTO;

public class ConvertService {

	public ConvertService() {
	}

	public CityDTO convertCityToCityDTO(City city) {
		CityDTO cityDTO = new CityDTO(city.getName(), convertTemp(city.getTemperature()));
		return cityDTO;
	}

	public String convertTemp(int temperature) {
		int temp = (temperature * 9 / 5) + 32;
		return Integer.toString(temp);
	}
}
