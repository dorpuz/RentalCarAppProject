package RentalCarAppProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.DateFormat;

@Entity
@Table
public class RentalCar {

  @Id
  private int idCar;
  @Column(nullable = false)
  private boolean isRented;
  private String nameOfRenters;
  private DateFormat rentFrom;
  private DateFormat rentTo;
}
