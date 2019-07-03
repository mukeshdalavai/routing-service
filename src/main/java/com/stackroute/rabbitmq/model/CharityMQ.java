package com.stackroute.rabbitmq.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@Builder
public class CharityMQ {

    private String username;
    private String password;
    private String charityName;
    private String address;
    private String location;
    private long foodRequirement;
    private long certificateNo;

    public CharityMQ(String username, String password, String charityName, String address, String location, long foodRequirement, long certificateNo) {
        this.username = username;
        this.password = password;
        this.charityName = charityName;
        this.address = address;
        this.location = location;
        this.foodRequirement = foodRequirement;
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

    public String getCharityName() {
        return charityName;
    }

    public void setCharityName(String charityName) {
        this.charityName = charityName;
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

    public long getFoodRequirement() {
        return foodRequirement;
    }

    public void setFoodRequirement(long foodRequirement) {
        this.foodRequirement = foodRequirement;
    }

    public long getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(long certificateNo) {
        this.certificateNo = certificateNo;
    }
}
