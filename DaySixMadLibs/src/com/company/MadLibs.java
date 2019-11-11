package com.company;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();

    // Getters

    public String getStory(){
        return story;
    }

    private String getName(){
        return name;
    }

    private String getAdjective1() {
        return adjective1;
    }

    private String getAdjective2() {
        return adjective2;
    }

    private String getNoun1() {
        return noun1;
    }

    private String getNoun2() {
        return noun2;
    }

    private String getNoun3() {
        return noun3;
    }

    private String getAdverb() {
        return adverb;
    }

    private String getRandomNums() {
        return randomNums;
    }

    // Setters

    private void setStory (String newStory) {
        story = newStory;
    }

    private void setName (String newName) {
        name = newName;
    }

    private void setAdjective1 (String newAdjective1) {
        adjective1 = newAdjective1;
    }

    private void setAdjective2 (String newAdjective2) {
        adjective2 = newAdjective2;
    }

    private void setNoun1 (String newNoun1) {
        noun1 = newNoun1;
    }

    private void setNoun2 (String newNoun2) {
        noun2 = newNoun2;
    }

    private void setNoun3 (String newNoun3) {
        noun3 = newNoun3;
    }

    private void setAdverb (String newAdverb) {
        adverb = newAdverb;
    }

    private void setRandomNums () {
        int num = Math.abs(rand.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3];
        while(index < numberHolder.length) {
            numberHolder[index] = num + index;
            index++;
        }
        randomNums = "not " + numberHolder[0] + ", not " + numberHolder[1] + ", but " + numberHolder[2];
    }

    // Print instructions to player

    private void printInstructions() {
        System.out.println("Welcome to the MadLibs game. If you type in words, we'll give you a story. Start by " +
                "typing in a name.");
    }

    // Get data from player

    private void enterName() {
        setName(scanner.nextLine());
    }

    private void enterNoun1() {
        System.out.println("Give me a noun.");
        setNoun1(scanner.nextLine());
    }

    private void enterNoun2() {
        System.out.println("Give me another noun.");
        setNoun2(scanner.nextLine());
    }

    private void enterNoun3() {
        System.out.println("Give me the last noun.");
        setNoun3(scanner.nextLine());
    }

    private void enterAdjective1() {
        System.out.println("I need an adjective.");
        setAdjective1(scanner.nextLine());
    }

    private void enterAdjective2() {
        System.out.println("I need another adjective.");
        setAdjective2(scanner.nextLine());
    }

    private void enterAdverb() {
        System.out.println("I need an adverb.");
        setAdverb(scanner.nextLine());
    }

    private void putTogetherTheStory() {
        String story;
        int num = Math.abs(rand.nextInt()) % 2;
        if (num == 0) {
            story = "Jesse and her best friend " + getName() + " went to Disney World today! They saw a " +
                    getNoun1() + " in a show at the Magic Kingdom and ate a " + getAdjective1() + " feast for dinner. " +
                    "The next day I ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2() + " and then that " +
                    "night I gazed at the " + getRandomNums() + " " + getAdjective2() + " fireworks shooting from the " +
                    getNoun3() + ".";
        } else {
            story = "Amanda and her fremeny " + getName() + " went to the zoo last summer. They saw a huge " +
                    getNoun1() + " and a tiny little " + getNoun2() + ". That night they decided to climb " +
                    getAdverb() + " into the " + getNoun3() + " to get a closer look. The zoo was " + getAdjective1() +
                    " at night, but they didn't care... until " + getRandomNums() + " " + getAdjective2() + " apes " +
                    "yelled in their faces, making Amanda and " + getName() + " sprint all the way back home.";
        }
        setStory(story);
    }

    private void play() {
        enterName();
        enterAdjective1();
        enterAdjective2();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdverb();
        setRandomNums();
        putTogetherTheStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {
        MadLibs game = new MadLibs();
        game.printInstructions();
        game.play();
    }
}
