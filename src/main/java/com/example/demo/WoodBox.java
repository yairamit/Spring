package com.example.demo;

public class Box {
    static int keyGenerator = 0;

    private int id;
    private String address;
    private Voulnteer owner;

    public Box(String address, Voulnteer owner) {
        this.address = address;
        this.owner = owner;
    }

    /* GETTERS */
    public String getAddress() {
        return address;
    }

    /*Setters*/
    public void setAddress(String address) {
        this.address = address;


    }

    public Voulnteer getOwner() {
        return owner;
    }

    public void setOwner(Voulnteer owner) {
        this.owner = owner;
    }

    // todo: addres, status, in charge of



}

