/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Chinhdd3
 */
public class RoomType {

    public RoomType(int roomTypeId, String name, int defaultPrice, int isDelete, int quantity, String description, int maxAdult, int maxChildren, int maxPeople) {
        this.roomTypeId = roomTypeId;
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.isDelete = isDelete;
        this.quantity = quantity;
        this.description = description;
        this.maxAdult = maxAdult;
        this.maxChildren = maxChildren;
        this.maxPeople = maxPeople;
    }

    private int roomTypeId;
    private String name;
    private int defaultPrice;
    private int isDelete;
    private int quantity;
    private String description;
    private int maxAdult;
    private int maxChildren;
    private int maxPeople;
    
    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(int defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxAdult() {
        return maxAdult;
    }

    public void setMaxAdult(int maxAdult) {
        this.maxAdult = maxAdult;
    }

    public int getMaxChildren() {
        return maxChildren;
    }

    public void setMaxChildren(int maxChildren) {
        this.maxChildren = maxChildren;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RoomType() {
    }
    
    
}
