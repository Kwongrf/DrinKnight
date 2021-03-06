package com.kwong.drinknight.home_page;

import java.sql.Time;
import java.util.Date;

/**
 * Created by 锐锋 on 2017/8/22.
 */

public class DrinkData {
    private String account;
    private String name;
    private String time;
    private float dose;

    public float getVolume_dose() {
        return volume_dose;
    }

    private float volume_dose;
    private String date;
    private String month;

    public String getMonth(){return month;}
    public void setMonth(){this.month=month;}
    public String getAccount() {
        return account;
    }

    public String getDate() {
        return date;
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

    public void setAccount(String account) {
        this.account = account;
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

    public void setDate(String date){this.date=date;}
}
