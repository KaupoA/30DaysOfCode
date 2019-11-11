package com.company;

import java.util.Random;

public class CoinToss {

    public String tossCoin() {

        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;

        if(toss == 0) {

            return "HEADS";

        } else {

            return "TAILS";

        }

    }

    public static void main(String[] args) {

        CoinToss game = new CoinToss();
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());

    }
}
