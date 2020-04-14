package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    //每个实体类的id
    private int id;

    //市级的名字
    private String cityName;

    //市级的代号
    private int cityCode;

    //所属省份的id
    private int provinceId;

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

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
