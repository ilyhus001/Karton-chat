package org.example;
import org.springframework.context.ApplicationStartupAware;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Login {
    Scanner input = new Scanner(System.in);
    HashMap<String, String> accountDict = new HashMap<>();
    public Login() {
        boolean loop = true;
        while (loop) {

            System.out.println("enter: \n1. to sign up \n2. to log in \n3. 'exit' to quit the program");
            String x = input.nextLine();

            switch (x) {
                case "1" -> signUp();
                case "2" -> startLogin();
                case "quit" -> {
                    loop = false;
                    System.out.println("exiting login");
                }
            }


        }
    }

    private void initializeUsers(){
        accountDict.put("user1", "pass1");
        accountDict.put("user2","pass2");
    }

    private  void signUp(){
        boolean loop = true;
        String username = "";
        String password = "";
        while (loop) {
            System.out.println("please enter username: ");
            username = input.nextLine();
            System.out.println("Please enter password: ");
            password = input.nextLine();
            if (accountDict.containsKey(username)){
                System.out.println("username already taken");
            } else {
                System.out.println("Account created");
                loop = false;
            }
        }
        accountDict.put(username,password);
    }

    private void startLogin(){
        System.out.println("please enter username: ");
        String username = input.nextLine();
        System.out.println("Please enter password: ");
        String password = input.nextLine();
        if(accountDict.get(username).equals(password)){
            System.out.println("Logging in!");
        }
    }

    public static void main(String[] args) {
        Login login = new Login();

    }

}
