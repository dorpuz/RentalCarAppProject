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
  public void init(){
    Car car1 = new Car("A","Fiat", "500", "red",55,false,4);
    car1 = carDao.save(car1);
    Car car2 = new Car("A","Chevrolet", "Spark", "pink",55,false,4);
    car2 = carDao.save(car2);
    Car car3 = new Car("A","Toyota", "Aygo", "silver",55,false,4);
    car3 = carDao.save(car3);
    Car car4 = new Car("A","Ford", "Ka", "white",55,false,4);
    car4 = carDao.save(car4);

    Car car5 = new Car("B","Renault", "Clio", "black",60,false,5);
    Car car6 = new Car("B","Ford", "Fiesta", "blue",60,false,5);
    Car car7 = new Car("B","Toyota", "Yaris", "yellow",60,false,5);
    Car car8 = new Car("B","VW", "Polo", "red",60,false,5);

    Car car9 = new Car("C","Citroen", "C4", "blue",70,false,5);
    Car car10 = new Car("C","Peugeot", "308", "gray",70,false,5);
    Car car11 = new Car("C","Opel", "Astra", "white",70,false,5);
    Car car12 = new Car("C","Toyota", "Auris", "red",70,false,5);

    Car car13 = new Car("D","Toyota", "Avensis", "white",80,false,5);
    Car car14 = new Car("D","Volvo", "S60", "black",80,false,5);
    Car car15 = new Car("D","Audi", "A5", "red",80,false,5);
    Car car16 = new Car("D","VW", "Passat", "silver",80,false,5);

    Car car17 = new Car("F","Audi", "A8", "white",100,false,5);
    Car car18 = new Car("F","BMW", "7 series", "brown",100,false,5);
    Car car19 = new Car("F","Porsche", "Panamera", "red",100,false,5);
    Car car20 = new Car("F","Jaguar", "XJ", "black",100,false,5);

    Car car21 = new Car("S","Jaguar", "F-Type", "black",120,false,4);
    Car car22 = new Car("S","Audi", "TT", "red",120,false,4);
    Car car23 = new Car("S","Porsche", "911", "red",120,false,4);
    Car car24 = new Car("S","Ford", "Mustang", "white",120,false,4);

  }

}
