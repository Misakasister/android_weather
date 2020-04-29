package com.example.weather.gson;
//实时空气质量（AQI）数据，

public class AQI {
    public AQICity city =new AQICity();
    public class  AQICity{
        public String aqi;
        public String pm25;
    }
}
