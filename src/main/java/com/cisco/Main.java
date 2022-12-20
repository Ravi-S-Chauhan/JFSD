package com.cisco;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {

        Screens screens = new Screens();
        Scanner sc = new Scanner(System.in);

        Screens.main();

        boolean flag = true;

        while (flag){
            System.out.println("\nPlease select an option from below\n");
            FileResourcesUtils.main("screen1");
            System.out.println();
//            System.out.println();
            int opt = sc.nextInt();
            switch (opt){
                case 1:
                    Files.ListAllFiles();
                    System.out.println();
//                    System.out.println();
                    break;
                case 2:
                    BusinessOperations.main();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("\nPlease select a valid option\n");
                    System.out.println();
                    break;
            }
        }
        System.out.println("End of application");



    }
}