package com.example.weather.gson;


public class Suggestion {
//    @SerializedName("comf")
    public Comfort comfort = new Comfort();
//    @SerializedName("cw")
    public CarWash carWash = new CarWash();
    public Sport sport = new Sport();
    public class Comfort{
//        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
//        @SerializedName("txt")
        public String info;
    }

    public class Sport{
//        @SerializedName("txt")
        public String info;
    }
}
