package com.company.kinivi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StringProcessor {


    public String readInputText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        System.out.println("");
        return br.readLine();

    }

    public String processText(String inputTex) {
        int pointer = 0;

        System.out.print("Enter size of word to delete:");
        System.out.println("");

        //using scanner to read int
        Scanner in = new Scanner(System.in);
        int sizeToDelete = in.nextInt();

        StringBuilder inputString = new StringBuilder(inputTex);
        StringBuilder outputString = new StringBuilder();
        Set<String> consonants = new HashSet<String>();

        consonants.add("B");
        consonants.add("C");
        consonants.add("D");
        consonants.add("F");
        consonants.add("G");
        consonants.add("H");
        consonants.add("J");
        consonants.add("K");
        consonants.add("L");
        consonants.add("M");
        consonants.add("N");
        consonants.add("P");
        consonants.add("Q");
        consonants.add("R");
        consonants.add("S");
        consonants.add("T");
        consonants.add("V");
        consonants.add("W");
        consonants.add("X");

        while (pointer < inputString.length()) {
            StringBuilder word;
            if (inputString.indexOf(" ", pointer + 1) == -1) {
                word =
                        new StringBuilder(inputString.substring(pointer, inputString.length()));
                pointer = inputString.length();
            } else {
                word =
                        new StringBuilder(inputString.substring(pointer, inputString.indexOf(" ", pointer + 1)));
                pointer = inputString.indexOf(" ", pointer + 1) + 1;
            }

            if(word.length() != sizeToDelete) {
                outputString.append(word);
                outputString.append(" ");
            } else {
                if (!consonants.contains(word.substring(0,1).toUpperCase())) {
                    outputString.append(word);
                    outputString.append(" ");
                }
            }

        }

        return outputString.toString();
    }

    public void showResult(String resultText /* or pass your class instance as parameter */) {
        // TODO: add implementation here
    }

}
