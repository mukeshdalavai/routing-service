package com.stackroute.rabbitmq.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@NoArgsConstructor
@Builder
public class DeliveryBoyMQ {

    private String username;
    private String password;
    private String deliveryBoyName;
    private String address;
    private String licenseNo;

    public DeliveryBoyMQ(String username, String password, String deliveryBoyName, String address, String licenseNo) {
        this.username = username;
        this.password = password;
        this.deliveryBoyName = deliveryBoyName;
        this.address = address;
        this.licenseNo = licenseNo;
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

    public String getDeliveryBoyName() {
        return deliveryBoyName;
    }

    public void setDeliveryBoyName(String deliveryBoyName) {
        this.deliveryBoyName = deliveryBoyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
}
