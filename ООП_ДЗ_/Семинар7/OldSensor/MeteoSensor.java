package Семинар7.OldSensor;

import java.time.*;

public interface MeteoSensor {
    int getId(); // идентификатор 

    Float getTemperature(); // температура 

    Float getHumidity(); // влажность

    Float getPressure(); // давление

    LocalDateTime getDateTime(); // время чтения данных 
}