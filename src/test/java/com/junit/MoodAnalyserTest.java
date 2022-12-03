package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

  /*  @Test
    public void moodAnalyserTest() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyserMood("This is a sad message");
        Assertions.assertEquals("SAD", mood);
    } */

    @Test
    public void givenMessageWhenProperShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
        String sadMood = moodAnalyser.analyserMood();
        System.out.println(sadMood);
        Assertions.assertEquals("SAD",sadMood);
    }
    @Test
    public void givenMessageWhenProperShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a happy mood");
        String happyMood = moodAnalyser.analyserMood();
        System.out.println(happyMood);
        Assertions.assertEquals("HAPPY",happyMood);
    }
    @Test
    public void givenMessageWhenProperShouldReturnNull() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String nullMood = moodAnalyser.analyserMood();
        System.out.println(nullMood);
        Assertions.assertEquals("Happy",nullMood);
    }
}