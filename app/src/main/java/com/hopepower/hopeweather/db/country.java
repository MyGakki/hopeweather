package com.hopepower.hopeweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 12531 on 2017/4/17.
 */

public class country extends DataSupport {

    private int id;

    private String countryName;//县的名字

    private String weatherId;//县对应的天气

    private int cityId;//当前城市Id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
