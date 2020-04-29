package com.example.weather.gson;



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
    public String cityName;
    public String weatherId;
    public Update update = new Update();
    public class  Update{
        public String updateTime;
    }
}
