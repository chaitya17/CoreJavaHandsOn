package com.chaitanya.corejava.day2;


class Cricket extends RuntimeException{

    Cricket(String message){
        super(message);
    }
}

class Football extends RuntimeException{

    Football(String message){
        super(message);
    }
}
public class CustomizedException {
    public static void main(String[] args) {
        String input="football";
        if(input.equalsIgnoreCase("Cricket"))
            throw new Cricket("We want to play cricket");
        else if (input.equalsIgnoreCase("Football")) {
            throw new  Football("We want to play Football");
        }
    }
}
