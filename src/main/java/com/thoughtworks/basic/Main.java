package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BowlingGame bowlingGame= new BowlingGame(new ArrayList<>(),new Frame(new ArrayList<>()));
        Scanner scanner = new Scanner(System.in);

        while (!bowlingGame.isEnd()){
            bowlingGame.roll(scanner.nextInt());
            bowlingGame.getScore();
            System.out.println(bowlingGame.showFramesScore());
        }
    }
}
