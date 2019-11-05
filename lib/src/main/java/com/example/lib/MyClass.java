package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        int hour,minutes,second = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入秒數");
        int SECOND = scanner.nextInt();
        hour = SECOND/3600;
        minutes = (SECOND%3600)/60;
        second =  (SECOND%3600)%60;
        System.out.printf(" %d 時 %d 分 %d 秒",hour,minutes,second);
    }
}
