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
public class MoodManagement {

    private static String filepath = "C:\\Users\\Kyra Balliram\\OneDrive\\Documents\\NetBeansProjects\\Celestite\\data\\emotions.txt";

    //adding emotion to text file
    public static void addEmotion(String emotion) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(filepath, true));
            pw.println(emotion);
            pw.close();

        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }
    
    
//getting emotion from text file
    public String getEmotion() {
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

    private static String filepathMood = "C:\\Users\\Kyra Balliram\\OneDrive\\Documents\\NetBeansProjects\\Celestite\\data\\overallMood.txt";
//adding overall emotion - button choice in add mood section
    public static void addOverallMood(String mood) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(filepathMood, true));
            pw.println(mood);
            pw.close();

        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }

    public String getOverallMood() {
        try {
            Scanner sc = new Scanner(new File(filepathMood));

            String output = "";
            while (sc.hasNextLine()) {
                String currentMood = sc.nextLine();
                output += currentMood + "\n";

            }
            sc.close();
            return output;
        } catch (FileNotFoundException ex) {
            System.out.println("Account file not found");
        }

        return "";
    }

}
