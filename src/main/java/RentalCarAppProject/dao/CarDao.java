package RentalCarAppProject.dao;

import RentalCarAppProject.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarDao extends CrudRepository<Car,Integer> {

  List<Car> findAll();
  List<Car> findAllByCarClass(String carClass);
  Car findById(int id);
}
