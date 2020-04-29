package com.example.weather.gson;

//import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    public String status;
    public Basic basic = new Basic();
    public  AQI aqi = new AQI();
    public Now now = new Now();
    public  Suggestion suggestion = new Suggestion();
//    @SerializedName("daily_forecast")
    public List<Forecast> forecasts = new ArrayList<>();
}
