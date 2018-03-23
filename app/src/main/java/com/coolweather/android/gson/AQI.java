package com.coolweather.android.gson;

/**
 * Created by 恋人星宇 on 2017/7/17.
 *
 * Gson 解析，一个json数组就是对应一个类
 *      这个类里面的字段，一个字段对应一个jsonObject
 */

public class AQI {
    public AQICity city;//city名称连接了字段，同时aqi和pm25是和json中数据格式同名的
    public  class AQICity{
        public String aqi;
        public String pm25;
    }
}
