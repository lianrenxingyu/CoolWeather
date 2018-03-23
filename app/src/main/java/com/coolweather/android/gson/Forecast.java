package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 恋人星宇 on 2017/7/17.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt_d")
        public String info;//天气信息
    }

    public class Temperature {
        public String max;
        public String min;
    }
}
