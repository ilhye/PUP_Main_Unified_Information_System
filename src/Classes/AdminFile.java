/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cris
 */
public class AdminFile {

    private String adminName;
    private String adminPass;
    private String adminUserN;
    private String adminCode;

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public String getAdminUserN() {
        return adminUserN;
    }

    public void setAdminUserN(String adminUserN) {
        this.adminUserN = adminUserN;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public boolean adminAccnt(String adminUserN, String adminPass) {
        try {
            File adminAccount = new File("Admin.txt");
            try (Scanner readAdmin = new Scanner(adminAccount)) {
                while (readAdmin.hasNextLine()) {
                    String line1 = readAdmin.nextLine();

                    if (line1.startsWith("Username: ")) {
                        if (line1.split(": ")[1].equals(adminUserN) && readAdmin.nextLine().split(": ")[1].equals(adminPass)) {
                            readAdmin.close();
                            return true;
                        }

                    }
                }
            }
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            return false;
        }
    }

    public boolean isAdminUN(String adminUserN) {
        try {
            File adminAccount = new File("Admin.txt");
            try (Scanner readAdmin = new Scanner(adminAccount)) {
                while (readAdmin.hasNextLine()) {
                    String line = readAdmin.nextLine();

                    if (line.startsWith("Username: ") && line.split(": ")[1].equals(adminUserN)) {
                        readAdmin.close();
                        return true;
                    }
                }
            }
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            return false;
        }
    }

    public boolean codeExist(String adminCode) {
        try {
            File adminAccount = new File("Admin.txt");
            try (Scanner readAdmin = new Scanner(adminAccount)) {
                while (readAdmin.hasNextLine()) {
                    String line = readAdmin.nextLine();

                    if (line.startsWith("Back-up Code: ") && line.split(": ")[1].equals(adminCode)) {
                        readAdmin.close();
                        return true;
                    }
                }
            }
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            return false;
        }
    }
    
    public void updateDate(String fCode, String fUsername, String fPassword) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Admin.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            ListIterator<String> iterator = lines.listIterator();
            while (iterator.hasNext()) {
                String currentLine = iterator.next();

                if (currentLine.startsWith("Back-up Code:") && currentLine.contains(fCode)) {
                    int fIndexCode = iterator.previousIndex();

                    if (fIndexCode >= 2) {
                        lines.set(fIndexCode - 2, "Username: " + fUsername);
                        lines.set(fIndexCode - 1, "Password: " + fPassword);
                    }
                }
            }
        } catch (IOException ex) {
//            Logger.getLogger(UserFile.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("Admin.txt"))) {
            for (String updatedLine : lines) {
                writer.println(updatedLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
