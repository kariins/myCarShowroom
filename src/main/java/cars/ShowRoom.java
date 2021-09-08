package cars;

import java.util.ArrayList;
import java.util.UUID;

public class ShowRoom {
  private ArrayList<Car> cars = new ArrayList<Car>();

  public String addCar(Car car) {
      this.cars.add(car);
      return car.name + " Added successfully";
  }
  public ArrayList<Car> getAllCars() {
      return cars;

  }
  public String getSingleCar(int carIndex) {
      try{
          Car car = this.cars.get(carIndex);
          return "Car Number: " + car.id + "\nCar Name" + car.name + "\nCar Manufactorer" + car.manufacturer + "\nCar Type" + car.type;
      } catch (Exception ex) {
          return "Unable to find specifies car";
      }
  }
  public String removeCar(int carIndex) {
      try {
          cars.remove(carIndex);
      } catch (Exception ex) {
          return "Unable to remove specified car";
      }
      return "Car removed successfully";
  }

}
