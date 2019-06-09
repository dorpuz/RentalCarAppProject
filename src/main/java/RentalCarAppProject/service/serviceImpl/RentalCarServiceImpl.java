package RentalCarAppProject.service.serviceImpl;

import RentalCarAppProject.dao.CarDao;
import RentalCarAppProject.dao.RentalCarDao;
import RentalCarAppProject.dto.CarDTO;
import RentalCarAppProject.model.Car;
import RentalCarAppProject.model.RentalCar;
import RentalCarAppProject.service.RentalCarService;
import RentalCarAppProject.utils.ComponentConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RentalCarServiceImpl implements RentalCarService {

  @Autowired
  CarDao carDao;

  @Autowired
  RentalCarDao rentalCarDao;

  @Autowired
  ComponentConverter converter;

  /*@Override
  public List<CarDTO> getAutoSegment(String carClass) {
    return carDao.findAllByCarClass(carClass)
            .stream()
            .map(converter::convert)
            .collect(Collectors.toList());
  }*/

  @Override
  public List<CarDTO> getAll(){
    return carDao.findAll()
            .stream()
            .map(converter::convert)
            .collect(Collectors.toList());
  }

  @Override
  public CarDTO getOne(int id) {
    return converter.convert(carDao.findById(id));
  }


/*  @Override
  public CarDTO rentOne(int id){
    Car car = carDao.findById(id);
    car.setRented(true);
    return converter.convert(car);
  }*/

  @Override
  public void rent(int id) {
    carDao.findById(id).setRented(true);
    //rentalCarDao.save(new RentalCar(id, true, startDate, endDate));

  }

}
