package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 恋人星宇 on 2017/7/17.
 */

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
//    因为daily_forecast在返回的json数据中是一个jsonArray数组，所以要用list存放
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
