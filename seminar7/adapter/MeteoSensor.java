package seminar7.adapter;

import java.time.LocalDateTime;

public interface MeteoSensor {
    int getI();
    float getTemperature();
    float getHumidity();
    LocalDateTime gDateTime();
}
