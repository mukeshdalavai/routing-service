package com.stackroute.rabbitmq.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Builder
public class RestaurantMQ {


    private String username;
    private String password;
    private String restaurantName;
    private String address;
    private String location;
    private long certificateNo;

    public RestaurantMQ(String username, String password, String restaurantName, String address, String location, long certificateNo) {
        this.username = username;
        this.password = password;
        this.restaurantName = restaurantName;
        this.address = address;
        this.location = location;
        this.certificateNo = certificateNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(long certificateNo) {
        this.certificateNo = certificateNo;
    }
}
