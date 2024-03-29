package com.stackroute.service;

import com.stackroute.domain.Charity;
import com.stackroute.domain.DeliveryBoy;
import com.stackroute.domain.Restaurant;


public interface DonationService {

    public Restaurant saveRestaurant(String restaurantId, String restaurantName, String location);

    public Charity saveCharity(String charityId, String charityName, String foodRequirement, String location);

    public DeliveryBoy saveDeliveryBoy(String deliveryBoyId, String deliveryBoyName, String status, String location);

    public String createRestaurantCharityRelation(String restaurantId, String charityId, int distance);

    public String createRestaurantDeliveryBoyRelation(String restaurantId, String deliveryBoyId, int distance);

    public String createDeliveryBoyCharityRelation(String deliveryBoyId, String charityId, int distance);

    public String updateRestaurantFoodAvailability(String restaurantId, String foodAvailability);

    public String updateDeliveryBoyStatusAndLocation(String deliveryBoyId, String status, String location);

    public Charity findByCharityName(String charityName);

    public DeliveryBoy findByDeliveryBoyName(String deliveryBoyName);

    public String removeRestaurantCharityRelation(String charityId);

    public String removeRestaurantDeliveryBoyRelation(String deliveryBoyId);

    public String createPicksFromRelation(String restaurantId, String deliveryBoyId);

    public String removeDeliveryBoyCharityRelation(String deliveryBoyId);

    public String createDeliversToRelation(String deliveryBoyId, String charityId);

    public String removeRestaurant(String restaurantId);

    public String removeCharity(String charityId);

    public String removeDeliveryBoy(String deliveryBoyId);

    public String startRouting();

    public String resetStats();

    public String resetPrecedence();

    public String[] sendToCharity(String charityId);

}
