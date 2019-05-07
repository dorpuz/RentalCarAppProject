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

  @GetMapping("/cars/segment")
  public List<CarDTO> getAutoSegment(@RequestParam char segment){
    return rentalCarService.getAutoSegment(segment);
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
