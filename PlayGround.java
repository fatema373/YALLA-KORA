package com.company;

import java.util.Scanner;

public class PlayGround {
    private String playgroundName;
    private int height;
    private int width;
    private String playgroundLocation;
    private int availablHours;
    private float price;
    private String cancellationPeriod;
    private int Id;
    private static int ID=0;

    public PlayGround() {
        this.playgroundName = "";
        this.height=0;
        this.availablHours=0;
        this.cancellationPeriod="";
        this.width=0;
        this.price=0;
        this.playgroundLocation="";
        Id=ID;
        ID++;
    }

    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setPlaygroundLocation(String playgroundLocation) {
        this.playgroundLocation = playgroundLocation;
    }

    public void setAvailablHours(int availablHours) {
        this.availablHours = availablHours;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCancellationPeriod(String cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }

    public String getPlaygroundName() {
        return playgroundName;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getPlaygroundLocation() {
        return playgroundLocation;
    }

    public int getAvailablHours() {
        return availablHours;
    }

    public float getPrice() {
        return price;
    }

    public String getCancellationPeriod() {
        return cancellationPeriod;
    }
    public int getArea(){
        return height*width;
    }
    public void groundInfo(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter payground Name: ");
        playgroundName= input.next();
        System.out.println("Enter payground Location: ");
        playgroundLocation= input.next();
        System.out.println("Enter payground Available hours: ");
        availablHours= input.nextInt();
        System.out.println("Enter payground price: ");
        price= input.nextInt();
        System.out.println("Enter payground cancellation period: ");
        cancellationPeriod= input.next();
        System.out.println("Enter payground height: ");
        height= input.nextInt();
        System.out.println("Enter payground width: ");
        width= input.nextInt();
    }

    @Override
    public String toString() {
        return "PlayGround{" +
                ",ID=' "+Id+
                "playgroundName='" + playgroundName + '\'' +
                ",Area='"+getArea()+
                ", playgroundLocation='" + playgroundLocation + '\'' +
                ", availablHours=" + availablHours +
                ", price=" + price +
                ", cancellationPeriod='" + cancellationPeriod + '\'' +
                '}';
    }

}
