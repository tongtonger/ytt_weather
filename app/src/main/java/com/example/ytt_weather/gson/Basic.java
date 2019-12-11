package com.example.ytt_weather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")//使用@SerializedName注解，来将类里的属性跟json里字段对应值匹配起来
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;//天气的更新时间

    }
}