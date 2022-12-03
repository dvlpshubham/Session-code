package com.junit;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyserMood() throws MoodAnalyserException {
        try {
            if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }

        } catch (NullPointerException exception) {
            throw new MoodAnalyserException("Invalid Mood");
           // System.out.println("Exception handled " + exception);
            // return "Happy";
        }

    }
}

