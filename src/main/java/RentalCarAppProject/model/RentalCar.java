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
  private Integer idCar;
  @Column(nullable = false)
  private boolean isRented;
  private DateFormat rentFrom;
  private DateFormat rentTo;

  public RentalCar(Integer idCar, boolean isRented, DateFormat rentFrom, DateFormat rentTo) {
    this.idCar = idCar;
    this.isRented = isRented;
    this.rentFrom = rentFrom;
    this.rentTo = rentTo;
  }

  public Integer getIdCar() {
    return idCar;
  }

  public void setIdCar(Integer idCar) {
    this.idCar = idCar;
  }

  public boolean isRented() {
    return isRented;
  }

  public void setRented(boolean rented) {
    isRented = rented;
  }

  public DateFormat getRentFrom() {
    return rentFrom;
  }

  public void setRentFrom(DateFormat rentFrom) {
    this.rentFrom = rentFrom;
  }

  public DateFormat getRentTo() {
    return rentTo;
  }

  public void setRentTo(DateFormat rentTo) {
    this.rentTo = rentTo;
  }
}
