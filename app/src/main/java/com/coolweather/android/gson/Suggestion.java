package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 恋人星宇 on 2017/7/17.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;


    public class Comfort {
        @SerializedName("txt")
        public String info;//舒适度信息
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;//洗车信息
    }

    public class Sport {
        @SerializedName("txt")
        public String info;//锻炼信息
    }
}
