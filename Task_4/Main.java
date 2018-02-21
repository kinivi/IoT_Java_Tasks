package com.company.kinivi;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	StringProcessor stringProcessor = new StringProcessor();
        String string = "";
        try {
             string = stringProcessor.readInputText();
            string = stringProcessor.processText(string);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(string);


    }
}
