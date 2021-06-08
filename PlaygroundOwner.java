package com.company;

public class PlaygroundOwner extends Registration  {
    PlayGround Myplayground = new PlayGround();

    public PlaygroundOwner() {
    }

    public void MyRequests(){
        Myplayground.groundInfo();
        System.out.println("Successful playground registration\n");
    }

    public void MyGround(){
        Myplayground.toString();
    }

    @Override
    public String toString() {
        return "PlaygroundOwner: " + Myplayground.toString()+super.toString();
    }
}
