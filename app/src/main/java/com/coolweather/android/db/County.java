package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherld;
    private int cityld;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherld() {
        return weatherld;
    }

    public void setWeatherld(String weatherld) {
        this.weatherld = weatherld;
    }

    public int getCityld() {
        return cityld;
    }

    public void setCityld(int cityld) {
        this.cityld = cityld;
    }
}
