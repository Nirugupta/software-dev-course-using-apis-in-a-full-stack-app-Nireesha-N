package org.launchcode.weather_dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// This class represents the collective properties we want from the
// full JSON payload received from OpenWeatherAPI.

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {

    private String name;
    @JsonProperty("weather")
    private List<Weather> weatherArray;
    @JsonProperty("main")
    private Main mainObject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Weather> getWeatherArray() {
        return weatherArray;
    }

    public void setWeatherArray(List<Weather> weatherArray) {
        this.weatherArray = weatherArray;
    }

    public Main getMainObject() {
        return mainObject;
    }

    public void setMainObject(Main mainObject) {
        this.mainObject = mainObject;
    }

    // TODO #3
    //  Take a look at the expected JSON payload on the response for
    //  a call to the current weather data at
    //  https://openweathermap.org/api/current?collection=current_forecast.
    //  Of the many properties in the full object, we are interested
    //  only in "name", "weather" and "main".
    //  Notice that "name" is a String, but "weather" is an array of objects
    //  and "main" is an object. Using a similar structure, compose this model
    //  using the Main and Weather models already defined in TODOs #1 and #2.
    //  Add getters and setters for all three fields. No need to define a
    //  constructor; the default will be fine.

}