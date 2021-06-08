package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private ArrayList<PlayGround>playGrounds=new ArrayList<PlayGround>();
    private ArrayList<Player>players=new ArrayList<Player>();
    public Application(){
        while(true){
            System.out.println("Welcome to YALLA kORA App");
            System.out.println("1-player\n2-playground owner\n3-List all players and playground in App\n4-Exit");
            int choice ;
            Scanner in=new Scanner(System.in);
            choice=in.nextInt();
            if(choice==1){
                Player player=new Player();
                player.userInfo();
                players.add(player);
                while(true){
                    System.out.println("1-Book Playground\n2-MyBooks\n3-back to home");
                    choice=in.nextInt();
                    if(choice==1){
                        if(playGrounds.isEmpty()){
                            System.out.println("There is no ground yet");

                        }
                        else{
                             System.out.println(playGrounds);
                             System.out.println("Enter Id of your chosen playground");
                             choice= in.nextInt();
                             player.setChosenPlayground(playGrounds.get(choice));
                             player.AddChosenPlayground();

                        }
                    }
                    else if(choice==2){
                        player.MyBooks();

                    }
                    else if(choice==3){
                        break;
                    }

                    else{
                        System.out.println("wrong input");
                    }

                }

            }
            else if(choice==2){
                PlaygroundOwner playGroundOwner=new PlaygroundOwner();
                playGroundOwner.userInfo();
                System.out.println("Enter 1 to request your playground");
                choice=in.nextInt();
                playGroundOwner.MyRequests();
                playGrounds.add(playGroundOwner.Myplayground);
            }
            else if(choice==4){
                break;
            }

            else if(choice==3){
                System.out.println("All playgrounds"+playGrounds);
                System.out.println("All players"+players);
            }
            else{
                System.out.println("Wrong input, try again");
            }
        }

    }

}

