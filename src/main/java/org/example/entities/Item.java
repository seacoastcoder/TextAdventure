package org.example.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

    @JsonProperty("id")
    private int itemId;

    @JsonProperty("name")
    private String itemName;

    public Item() {}

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
