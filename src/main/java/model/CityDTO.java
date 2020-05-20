package model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class CityDTO {

	@Id
	private String name;

	private String temperatureInFahrenheit;

	public CityDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityDTO(String name, String temperatureInFahrenheit) {
		super();
		this.name = name;
		this.temperatureInFahrenheit = temperatureInFahrenheit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemperatureInFahrenheit() {
		return temperatureInFahrenheit;
	}

	public void setTemperatureInFahrenheit(String temperatureInFahrenheit) {
		this.temperatureInFahrenheit = temperatureInFahrenheit;
	}

}
