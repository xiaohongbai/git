package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Long> arrayList=new ArrayList<>();
        ArrayList<Long> array=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            Long a=sc.nextLong();
            arrayList.add(a);
        }
    }
}