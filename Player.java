package com.company;

import java.util.ArrayList;

public class Player extends Registration {

    private ArrayList<PlayGround> mybooks= new ArrayList<PlayGround>();
    private PlayGround ChosenPlayground;
    private float totalPtice;
    public Player() {
    }

    public void setChosenPlayground(PlayGround chosenPlayground) {
        ChosenPlayground = chosenPlayground;
    }

    public PlayGround getChosenPlayground() {
        return ChosenPlayground;
    }

    public void AddChosenPlayground(){
        mybooks.add(this.ChosenPlayground);
    }

    public void MyBooks (){
        System.out.println(mybooks);

    }

    public float tatalPrice(int hours){

        totalPtice=  getChosenPlayground().getPrice()*hours;
        return totalPtice;
    }

    public boolean Ewallet(int balance){
        if(balance<totalPtice){
            System.out.println("failed booking");
            return false;
        }
        else{
            System.out.println("Booking done");
            return true;
        }

    }
    @Override
    public String toString() {
        return "Player{" +
                "mybooks=" + mybooks +
                ", ChosenPlayground=" + ChosenPlayground +
                "} " + super.toString();
    }
}
