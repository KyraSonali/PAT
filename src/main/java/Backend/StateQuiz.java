/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Kyra Balliram
 */
public class StateQuiz {

    public static int choice1;
    public static int choice2;
    public static int choice3;
    public static int choice4;
    public static int choice5;
    public static int choice6;
    public static int choice7;
    //public static int of each option
    //defensive programming agaisnt next button
    //calculaatec end thing and explanation
    //fix txt files 

    public static int score(int choice1, int choice2, int choice3, int choice4, int choice5, int choice6, int choice7) {
        int finalScore = choice1 + choice2 + choice3 + choice4 + choice5 + choice6 + choice7;
        return finalScore;
    }

    private static String filepath = "C:\\Users\\Kyra Balliram\\OneDrive\\Documents\\NetBeansProjects\\Celestite\\quizScore";

    public static void addResult(String score) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(filepath, true));
            pw.println(score);
            pw.close();

        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }

    public String getResult() {
        try {
            Scanner sc = new Scanner(new File(filepath));
            String output = "";
            while (sc.hasNextLine()) {
                String currentEmotion = sc.nextLine();
                output += currentEmotion + "\n";
            }
            sc.close();
            return output;
        } catch (FileNotFoundException ex) {
            System.out.println("Account file not found");
        }

        return "";
    }

}
