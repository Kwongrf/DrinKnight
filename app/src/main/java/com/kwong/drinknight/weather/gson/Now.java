package com.kwong.drinknight.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 锐锋 on 2017/8/30.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("hum")
    public String humidity;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
