package com.example.weather.gson;


public class Now {
//    @SerializedName("tmp")
    public String temperature;
//    @SerializedName("cond")
    public More more = new More();
    public class More{
//        @SerializedName("txt")
        public String Info;
    }
}
