package com.brizingr16gecr.bean;

import java.io.Serializable;

/**
 * Created by Naimish Rajput on 20-02-2016.
 */

public class Detail implements Serializable {

    private String heading;
    private String description;
    private String levels;
    private String rules;
    private String resources;
    private String place;
    private String event_time;
    private String coord_name;
    private String contact_no;

    public Detail(String heading, String description, String levels, String rules, String resources, String event_time, String place, String coord_name, String contact_no) {
        this.heading = heading;
        this.description = description;
        this.levels = levels;
        this.rules = rules;
        this.resources = resources;
        this.place = place;
        this.event_time = event_time;
        this.coord_name = coord_name;
        this.contact_no = contact_no;
    }

    public String getCoord_name() {
        return coord_name;
    }

    public void setCoord_name(String coord_name) {
        this.coord_name = coord_name;
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEvent_time() {
        return event_time;
    }

    public void setEvent_time(String event_time) {
        this.event_time = event_time;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
