package org.launchcode.weather_dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// This class represents the properties we want from the "main" key of
// the JSON payload received from OpenWeatherMap.

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {

    private double temp;
    @JsonProperty("feels_like")
    private double feelsLike;
    private double pressure;
    private double humidity;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

// TODO #2
    //  Take a look at the expected JSON payload on the response for
    //  a call to the current weather data at
    //  https://openweathermap.org/api/current?collection=current_forecast.
    //  Of the many properties in the "main" object, we are interested
    //  only in "temp", "feels_like", "pressure", and "humidity".
    //  Create these four fields and add getters and setters for both. No need
    //  to define a constructor; the default will be fine.
    //  For "feels_like", you should use camelCase for the Java variable, then
    //  add the annotation @JsonProperty("feels_like") above it to correlate them.

}
