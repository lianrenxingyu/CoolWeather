package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 恋人星宇 on 2017/7/17.
 */

public class Now {
    @SerializedName("tmp")//气温
    public String temperature;

    @SerializedName("cond")//天气状况
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
