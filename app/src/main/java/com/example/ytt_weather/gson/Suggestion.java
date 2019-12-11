package com.example.ytt_weather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    /**
     * 用以描述一些天气所对应的人们应该做什么活动
     */
    @SerializedName("comf")
    public  Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }


}
