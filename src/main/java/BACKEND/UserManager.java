/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND;

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
public class UserManager {

    private static String users = "data\\users.txt";

    public static void addUser(String username, String password) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(users, true));
            pw.println(username + "#" + password);
            pw.close();

        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }


    public static boolean checkUser(String username, String password) {
        try {
            Scanner sc = new Scanner(new File(users));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String currentUser = lineSc.next();
                String currentPassword = lineSc.next();

                if (currentUser.equals(username) && currentPassword.equals(password)) {
                    return true;
                }

            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Account file not found");
        }

        return false;
    }
    
    
    
     public static String getusers() {
        try {
            Scanner sc = new Scanner(new File(users));
            
            String output = "";
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String currentUser = lineSc.next();
                String currentPassword = lineSc.next();

                output+=currentUser+ "\n";

            }
            sc.close();
            return output;
        } catch (FileNotFoundException ex) {
            System.out.println("Account file not found");
        }

        return "";
    }

}


