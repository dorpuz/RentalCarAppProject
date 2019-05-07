package RentalCarAppProject.service.serviceImpl;

import RentalCarAppProject.dao.CarDao;
import RentalCarAppProject.dto.CarDTO;
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
  ComponentConverter converter;

  @Override
  public List<CarDTO> getAutoSegment(char segment) {
    return carDao.findAllBySegmentIsLike(segment)
            .stream()
            .map(converter::convert)
            .collect(Collectors.toList());
  }

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

  @Override
  public void rent(int id) {
    carDao.findById(id).setRented(true);
  }
}
