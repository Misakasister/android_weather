package com.example.weather.gson;


public class Forecast {
    public String date;
//    @SerializedName("tmp")
    public Temperature temperature = new Temperature();
//    @SerializedName("cond")
    public More more = new More();
    public  class  Temperature{
        public String max;
        public String min;
    }

    public class More{
//        @SerializedName("txt_d")
        public String info;
    }
}
