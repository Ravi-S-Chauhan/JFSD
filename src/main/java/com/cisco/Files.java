package com.cisco;

import java.io.File;
import java.io.IOException;

public class Files {
    final static String dir = System.getProperty("user.dir")+"\\target\\files\\";
    public static void CreateFile(String name){
//        String dir = System.getProperty("user.dir");
        System.out.println(dir+name+".txt");
        try{
            File obj = new File(dir+name+".txt");
            if (obj.createNewFile()){
                System.out.println("File created Successfully : "+name);
            }
            else {
                System.out.println("File already present! ");
            }
        } catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    public static void searchFiles(String name){
        String[] ls = getFiles();
        if (name == null || ls == null) {
            System.out.println("\nFiles does not exist\n");
        } else if (ls != null) {
            for (String str:ls){
//                System.out.println(str+" "+name+".txt"+str.substring(0,str.length() - 4));

                if (str.substring(0,str.length() - 4).equals(name)){
                    System.out.println("File present in the Application");
                    return;
                }
            }
        }
        System.out.println("File not present in the application");
    }
    public static  String[] getFiles(){
        File obj = new File(dir);
        System.out.println(obj);
        String contents[] = obj.list();
        return contents;
    }

    public static void ListAllFiles(){
        String[] ls = getFiles();
        for(String str:ls){
            System.out.println(str);
        }
        System.out.println();

    }

    public static void Delete(String name){
        File file = new File(dir+"\\"+name+".txt");
        System.out.println(file);
//        searchFiles(name);
        if (file.delete()){
            System.out.println("File "+name+".txt has been deleted successfully");
        }else {
            System.out.println("Unable to delete the file");
        }
    }
}
