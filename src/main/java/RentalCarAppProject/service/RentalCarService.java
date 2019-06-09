package RentalCarAppProject.service;

import RentalCarAppProject.dto.CarDTO;

import java.util.List;

public interface RentalCarService {
  List<CarDTO> getAll();
//  List<CarDTO> getAutoSegment(String carClass);
  CarDTO getOne(int id);
  //CarDTO rentOne(int id);
  void rent(int id);
}
