package Семинар7.DataBase;

import Семинар7.OldSensor.MeteoSensor;

 // сохраняем данные 

public class MeteoStore {
  public boolean save(MeteoSensor meteoSensor) {
    System.out.format("Saving data from sensor [%d] at %s%n temperature - %f ; humidity - %f ; pressure - %f \n\r",
        meteoSensor.getId(),
        meteoSensor.getDateTime(),
        meteoSensor.getTemperature(),
        meteoSensor.getHumidity(),
        meteoSensor.getPressure());
    return true;
  }
}