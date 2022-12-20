package com.cisco;

public class Screens {
    public static void main(){
        Screens view = new Screens();
        System.out.println();
        view.WelcomeString();
    }
    public void WelcomeString(){
        int count = 30;
        String welcome = "    Welcome    ";
        String name = " Ravi Chauhan ";
        System.out.println();
        System.out.println("*".repeat(count)+welcome+"*".repeat(count));
        System.out.println("*".repeat(count)+name+"*".repeat(count));
        System.out.println();

    }
}
