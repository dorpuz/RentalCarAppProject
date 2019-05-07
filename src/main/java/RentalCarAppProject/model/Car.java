package RentalCarAppProject.model;

import javax.persistence.*;

@Entity
@Table
public class Car {

  @Id
  @GeneratedValue
  private Integer idCar;
  @Column(nullable = false)
  private char segment;
  @Column(nullable = false)
  private String marka;
  @Column(nullable = false)
  private String model;
  @Column(nullable = false)
  private String color;
  @Column(nullable = false)
  private double price;
  @Column(nullable = false)
  private boolean isRented;
  @Column(nullable = false)
  private int nrOfSeats;

  public Car() {
  }

  public Car(char segment, String marka, String model, String color, double price, boolean isRented, int nrOfSeats) {
    this.segment = segment;
    this.marka = marka;
    this.model = model;
    this.color = color;
    this.price = price;
    this.isRented = isRented;
    this.nrOfSeats = nrOfSeats;
  }

  public void setId(Integer id) {
    this.idCar = id;
  }

  public int getId() {
    return idCar;
  }

  public String getMarka() {
    return marka;
  }

  public void setMarka(String marka) {
    this.marka = marka;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public boolean isRented() {
    return isRented;
  }

  public void setRented(boolean rented) {
    isRented = rented;
  }

  public char getSegment() {
    return segment;
  }

  public void setSegment(char segment) {
    this.segment = segment;
  }

  public Integer getIdCar() {
    return idCar;
  }

  public void setIdCar(Integer idCar) {
    this.idCar = idCar;
  }

  public int getNrOfSeats() {
    return nrOfSeats;
  }

  public void setNrOfSeats(int nrOfSeats) {
    this.nrOfSeats = nrOfSeats;
  }
}
