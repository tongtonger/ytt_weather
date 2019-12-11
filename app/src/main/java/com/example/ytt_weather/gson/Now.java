package com.example.ytt_weather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")//温度
    public String temperature;

    @SerializedName("cond")
    public More more;//如显示阵雨，晴等

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
