package RentalCarAppProject.service;

import RentalCarAppProject.dto.CarDTO;

import java.util.List;

public interface RentalCarService {
  List<CarDTO> getAll();
  List<CarDTO> getAutoSegment(char segment);
  CarDTO getOne(int id);
}
