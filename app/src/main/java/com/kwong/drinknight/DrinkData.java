package com.kwong.drinknight;

import java.sql.Time;

/**
 * Created by 锐锋 on 2017/8/22.
 */

public class DrinkData {
    private String id;
    private String name;
    private String time;
    private float dose;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public float getDose() {
        return dose;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDose(float dose) {
        this.dose = dose;
    }
}
