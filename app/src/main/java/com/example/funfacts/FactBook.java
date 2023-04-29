package com.example.funfacts;

import java.util.Random;

public class FactBook {
    String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };
    //The button was clicked, so update with new fact
    //randomly select the fact

    Random randomGen = new Random();
    String getFact(){
        int randomNum = randomGen.nextInt(facts.length-1);
        return facts[randomNum];
    }

}
