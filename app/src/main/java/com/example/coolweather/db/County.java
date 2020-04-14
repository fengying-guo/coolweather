package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    //每个实体类的id
    private int id;

    //县级的名字
    private String cityName;

    //对应天气Id
    private int weatherId;

    //所属市级的Id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
