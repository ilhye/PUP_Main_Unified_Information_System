/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
                    /*if (line1.startsWith("Username: ") && line1.contains(adminUserN)) {
                        System.out.println("Username from file: " + line1);
                        readAdmnin.close();
                        return true;
                    }*/
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
}
