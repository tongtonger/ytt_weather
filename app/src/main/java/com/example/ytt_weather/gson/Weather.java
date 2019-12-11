package com.example.ytt_weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import com.example.ytt_weather.gson.*;

public class Weather {
    public String status;//天气返回成功则ok,返回失败则
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;//daily_Forecast是一个数组
}