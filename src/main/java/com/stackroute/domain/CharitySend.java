package com.stackroute.domain;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.neo4j.ogm.annotation.NodeEntity;


@JsonPOJOBuilder
@NodeEntity
public class CharitySend {
    private Charity charity;
    private DeliveryBoy deliveryBoy;

    public CharitySend() {
    }

    public CharitySend(Charity charity, DeliveryBoy deliveryBoy) {
        this.charity = charity;
        this.deliveryBoy = deliveryBoy;
    }

    public Charity getCharity() {
        return charity;
    }

    public void setCharity(Charity charity) {
        this.charity = charity;
    }

    public DeliveryBoy getDeliveryBoy() {
        return deliveryBoy;
    }

    public void setDeliveryBoy(DeliveryBoy deliveryBoy) {
        this.deliveryBoy = deliveryBoy;
    }
    //    private String charityId;
//    private String foodAvailable;
//    private String deliveryBoyId;
//    private String deliveryBoyName;
//
//    public CharitySend() {
//    }
//
//    public CharitySend(String charityId, String foodAvailable, String deliveryBoyId, String deliveryBoyName) {
//        this.charityId = charityId;
//        this.foodAvailable = foodAvailable;
//        this.deliveryBoyId = deliveryBoyId;
//        this.deliveryBoyName = deliveryBoyName;
//    }
//
//    public String getCharityId() {
//        return charityId;
//    }
//
//    public void setCharityId(String charityId) {
//        this.charityId = charityId;
//    }
//
//    public String getFoodAvailable() {
//        return foodAvailable;
//    }
//
//    public void setFoodAvailable(String foodAvailable) {
//        this.foodAvailable = foodAvailable;
//    }
//
//    public String getDeliveryBoyId() {
//        return deliveryBoyId;
//    }
//
//    public void setDeliveryBoyId(String deliveryBoyId) {
//        this.deliveryBoyId = deliveryBoyId;
//    }
//
//    public String getDeliveryBoyName() {
//        return deliveryBoyName;
//    }
//
//    public void setDeliveryBoyName(String deliveryBoyName) {
//        this.deliveryBoyName = deliveryBoyName;
//    }
}
