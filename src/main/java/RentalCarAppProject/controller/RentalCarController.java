package RentalCarAppProject.controller;

import RentalCarAppProject.dto.CarDTO;
import RentalCarAppProject.service.serviceImpl.RentalCarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class RentalCarController {

  @Autowired
  RentalCarServiceImpl rentalCarService;

  @GetMapping("/cars")
  public List<CarDTO> getAll() {
    return rentalCarService.getAll();
  }

  @GetMapping("/cars/{carClass}")
  public List<CarDTO> getAutoSegment(@PathVariable String carClass){
    return rentalCarService.getAutoSegment(carClass);
  }

  @GetMapping("/cars/{id}")
  public CarDTO getOne(@PathVariable int id) {
    return rentalCarService.getOne(id);
  }

  @PostMapping("cars/{id}")
  public void update(@PathVariable int id){
    rentalCarService.rent(id);
  }
}
