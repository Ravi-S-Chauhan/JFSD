package com.cisco;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class BusinessOperations {

    public static void main() throws IOException, URISyntaxException {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("\nPlease select an option from below\n");
            FileResourcesUtils.main("screen2");
            System.out.println();
//            System.out.println();
            int opt = sc.nextInt();
            switch (opt){
                case 1:
                    System.out.println("\nPlease enter the file name\n");
                    String name = sc.next();
                    Files.CreateFile(name);
                    break;
                case 2:
                    System.out.println("\nPlease enter the file name you want to delete");
                    String nAme = sc.next();
                    Files.Delete(nAme);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\nPlease enter the file name you want to search\n");
                    String Name = sc.next();
                    Files.searchFiles(Name);
                    System.out.println();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Please select a valid option");
            }
        }
        System.out.println("\nEnd of Business Operations\n");


    }
}
