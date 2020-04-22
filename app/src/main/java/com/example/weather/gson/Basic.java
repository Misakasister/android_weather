package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

/*
"basic": {
			"cid": "CN101010100",
			"location": "北京",
			"parent_city": "北京",
			"admin_area": "北京",
			"cnty": "中国",
			"lat": "39.90498734",
			"lon": "116.4052887",
			"tz": "+8.00"
		},
		"update": {
			"loc": "2019-06-05 22:39",
			"utc": "2019-06-05 14:39"
		},
 */

public class Basic {
    @SerializedName("city")  //将json中的city 改为cityname
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class  Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
