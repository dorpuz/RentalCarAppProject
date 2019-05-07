package RentalCarAppProject.utils;

import RentalCarAppProject.dto.CarDTO;
import RentalCarAppProject.model.Car;
import org.springframework.stereotype.Component;

@Component
public class ComponentConverter {


  public Car convert(CarDTO carDTO) {

    Car car = new Car();

    car.setMarka(carDTO.marka);
    car.setModel(carDTO.model);
    car.setColor(carDTO.color);
    car.setPrice(carDTO.price);
    car.setSegment(carDTO.segment);
    car.setId(carDTO.id);
    car.setRented(carDTO.isRented);

    return car;
  }

  public CarDTO convert(Car car){
    CarDTO carDTO = new CarDTO();

    carDTO.id = car.getId();
    carDTO.marka = car.getMarka();
    carDTO.model = car.getModel();
    carDTO.color = car.getColor();
    carDTO.price = car.getPrice();
    carDTO.segment = car.getSegment();
    carDTO.isRented = car.isRented();

    return carDTO;
  }
}

