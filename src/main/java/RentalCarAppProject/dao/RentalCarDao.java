package RentalCarAppProject.dao;

import RentalCarAppProject.model.RentalCar;
import org.springframework.data.repository.CrudRepository;

public interface RentalCarDao extends CrudRepository<RentalCar, Integer> {

}
