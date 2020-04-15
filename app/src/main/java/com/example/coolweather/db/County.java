package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    //每个实体类的id
    private int id;

    //县级的名字
    private String countyName;

    //对应天气Id
    private String weatherId;

    //所属市级的Id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String cityName) {
        this.countyName = cityName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
