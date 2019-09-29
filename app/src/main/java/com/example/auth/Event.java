
package com.example.auth;

public class Event {
    private String name;
    private String desc;
    private int volunteers;
    private String eventdate;
    private String adinfo;
    private double lat;
    private double lng;



    public Event()
    {

    }
    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }



    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(int volunteers) {
        this.volunteers = volunteers;
    }

    public String getEventdate() {
        return eventdate;
    }

    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }

    public String getAdinfo() {
        return adinfo;
    }

    public void setAdinfo(String adinfo) {
        this.adinfo = adinfo;
    }
}
