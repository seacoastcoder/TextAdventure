package org.example.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Connection {

    @JsonProperty("North")
    private int north = 0;

    @JsonProperty("East")
    private int east = 0;

    @JsonProperty("West")
    private int west = 0;

    @JsonProperty("South")
    private int south = 0;

    public Connection() {}

    public int getNorth() {
        return north;
    }

    public void setNorth(int north) {
        this.north = north;
    }

    public int getEast() {
        return east;
    }

    public void setEast(int east) {
        this.east = east;
    }

    public int getWest() {
        return west;
    }

    public void setWest(int west) {
        this.west = west;
    }

    public int getSouth() {
        return south;
    }

    public void setSouth(int south) {
        this.south = south;
    }
}
