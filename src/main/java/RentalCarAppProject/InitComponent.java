/*
package RentalCarAppProject;

import RentalCarAppProject.dao.CarDao;
import RentalCarAppProject.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitComponent {

  @Autowired
  CarDao carDao;

  @PostConstruct
  public void init() {

    Car[] cars = {new Car("A", "Fiat", "500", "red", 55, false, 4),
            new Car("A", "Chevrolet", "Spark", "pink", 55, false, 4),
            new Car("A", "Toyota", "Aygo", "silver", 55, false, 4),
            new Car("A", "Ford", "Ka", "white", 55, false, 4),
            new Car("B", "Renault", "Clio", "black", 60, false, 5),
            new Car("B", "Ford", "Fiesta", "blue", 60, false, 5),
            new Car("B", "Toyota", "Yaris", "yellow", 60, false, 5),
            new Car("B", "VW", "Polo", "red", 60, false, 5),
            new Car("C", "Citroen", "C4", "blue", 70, false, 5),
            new Car("C", "Peugeot", "308", "gray", 70, false, 5),
            new Car("C", "Opel", "Astra", "white", 70, false, 5),
            new Car("C", "Toyota", "Auris", "red", 70, false, 5),
            new Car("D", "Toyota", "Avensis", "white", 80, false, 5),
            new Car("D", "Volvo", "S60", "black", 80, false, 5),
            new Car("D", "Audi", "A5", "red", 80, false, 5),
            new Car("D", "VW", "Passat", "silver", 80, false, 5),
            new Car("F", "Audi", "A8", "white", 100, false, 5),
            new Car("F", "BMW", "7 series", "brown", 100, false, 5),
            new Car("F", "Porsche", "Panamera", "red", 100, false, 5),
            new Car("F", "Jaguar", "XJ", "black", 100, false, 5),
            new Car("S", "Jaguar", "F-Type", "black", 120, false, 4),
            new Car("S", "Audi", "TT", "red", 120, false, 4),
            new Car("S", "Porsche", "911", "red", 120, false, 4),
            new Car("S", "Ford", "Mustang", "white", 120, false, 4)};


    for (Car c : cars) {
      carDao.save(c);
    }

  }
}
*/
