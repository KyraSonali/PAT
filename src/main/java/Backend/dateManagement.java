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
public class dateManagement {

    private static String filepathDate = "C:\\Users\\Kyra Balliram\\OneDrive\\Documents\\NetBeansProjects\\Celestite\\data\\date.txt";

    public static void addDate(String day, String date, String month, String year) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(filepathDate, false));
            pw.print(day + "-" + date + "-" + month + "-" + year);//use "-" to separate day,date,month,year
            pw.close();

        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }
//defensive coding 
    public boolean checkDate(String day, String date, String month, String year) {
        boolean flag = true; //Does not contain letters
        char c = 'a';

        for (int i = 0; i < year.length(); i++) {
            c = year.charAt(i);

            if (!Character.isDigit(c) || year.length() != 4) {
                flag = false;
            }
        }
        //checks if any fields have been left empty 
        boolean check = flag && !day.isBlank() && !date.isBlank() && !month.isBlank() && !year.isBlank();
        return check;
    }

    public String getDate() {
        try {
            Scanner sc = new Scanner(new File(filepathDate));

            String output = "";
            while (sc.hasNext()) {
                String currentDate = sc.next();
                output += currentDate + "\n";

            }
            sc.close();
            return output;
        } catch (FileNotFoundException ex) {
            System.out.println("Account file not found");
        }

        return "";
    }

}
