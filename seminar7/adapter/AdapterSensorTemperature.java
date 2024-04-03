package seminar7.adapter;

import java.time.LocalDateTime;

public class AdapterSensorTemperature implements MeteoSensor{
    SensorTemperature sensor;

    public AdapterSensorTemperature(SensorTemperature sensor){
        this.sensor = sensor;
    }

    @Override
    public int getI() {
        return sensor.identifier();
    }

    @Override
    public float getTemperature() {
        return (float)sensor.temperature();
    }

    
    public float getHumidity() {
        return 0;
    }

    @Override
    public LocalDateTime gDateTime() {
        return null;
    }
}
