package Classes;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.logging.*;

public class FileHandling {
    private String fName;
    private String fUsername;
    private String fPassword;
    private String fCode;

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the fUsername
     */
    public String getfUsername() {
        return fUsername;
    }

    /**
     * @param fUsername the fUsername to set
     */
    public void setfUsername(String fUsername) {
        this.fUsername = fUsername;
    }

    /**
     * @return the fPassword
     */
    public String getfPassword() {
        return fPassword;
    }

    /**
     * @param fPassword the fPassword to set
     */
    public void setfPassword(String fPassword) {
        this.fPassword = fPassword;
    }

    /**
     * @return the fCode
     */
    public String getfCode() {
        return fCode;
    }

    /**
     * @param fCode the fCode to set
     */
    public void setfCode(String fCode) {
        this.fCode = fCode;
    }
    
    public int isUsernameExist(String fUsername) {
    try {
        if (fUsername.isEmpty()) {
            return 2; // If the provided username is empty, it does not exist
        }
        
        File accounts = new File("Account.txt");
        Scanner myReader = new Scanner(accounts);
        
        File adminAccount = new File("Admin.txt");
        Scanner readAdmnin = new Scanner(adminAccount);
        
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            
            if (line.startsWith("Username: ") && line.contains(fUsername)) {
                System.out.println("Username from file: " + line);
                myReader.close();
                return 0;
            }
        }
        
        while (readAdmnin.hasNextLine()) {
            String line1 = readAdmnin.nextLine();
            
            if (line1.startsWith("Username: ") && line1.contains(fUsername)) {
                System.out.println("Username from file: " + line1);
                readAdmnin.close();
                return 2;
            }
        }
        
        myReader.close();
        return 1;
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        return 1;
    }
}

    
    // Method to check if backup code exist within a file.
    public boolean codeExist(String fCode) {
        try {
            File accounts = new File("Account.txt");
            Scanner myReader = new Scanner(accounts);

            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                
                if (line.startsWith("Back-up Code: ") && line.contains(fCode)) {
                    myReader.close();
                    return true;
                }
            }
            myReader.close();
            return false;
        } catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            return false;
        }
    }
    
    // Method to check if password and username exist within a file.
    public int isUnamePassValid(String fUsername, String fPassword) {
        try {
            File accounts = new File("Account.txt");
            Scanner myReader = new Scanner(accounts);
            
            File adminAccount = new File("Admin.txt");
            Scanner readAdmnin = new Scanner(adminAccount);
            
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                
                if (line.startsWith("Username: ") && line.contains(fUsername)
                && myReader.nextLine().split(": ")[1].equals(fPassword)) {
                    myReader.close();
                    return 0;
                } 
            }
            
            while (readAdmnin.hasNextLine()) {
                String line1 = readAdmnin.nextLine();
                
                if (line1.startsWith("Username: ") && line1.contains(fUsername)
                && readAdmnin.nextLine().split(": ")[1].equals(fPassword)) {
                    System.out.println("Valid username: " + fUsername + "Password: " + fPassword);
                    readAdmnin.close();
                    return 2;
                }
            }
            //readAdmnin.close();
            myReader.close();
            return 1;
        } catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            return 1;
        }
    }
    
    // Method to add data in the file
    public boolean storeData(String fName, String fUsername, String fPassword,String fCode) {
        File accounts = new File("Account.txt");
        if (accounts.exists()) {
            try (FileWriter fileWriter = new FileWriter(accounts, true)) {
                fileWriter.write("Name: " + fName + "\n");
                fileWriter.write("Username: " + fUsername + "\n");
                fileWriter.write("Password: " + fPassword + "\n");
                fileWriter.write("Back-up Code: " + fCode + "\n\n");

                fileWriter.close();
            } catch (IOException e) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return false;
    }
    
    public void updateDate(String fCode, String fUsername, String fPassword) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Account.txt"))) {
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
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
            return; 
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("Account.txt"))) {
            for (String updatedLine : lines) {
                writer.println(updatedLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
