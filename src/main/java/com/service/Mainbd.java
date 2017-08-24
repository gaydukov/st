package com.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Маша on 06.03.2017.
 */
public class Mainbd {
    public static void main(String[] args) {
        DAO t=new DAO();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dobavit stydenta?      y/n");
        try {
            if (br.readLine().equals("y")){
                System.out.println("Vvedite name");
                String name=br.readLine();
                System.out.println("Vvedite grupu");
                int grupa=Integer.parseInt(br.readLine());
                System.out.println("Vvedite ocenku");
                int ocenka=Integer.parseInt(br.readLine());
                t.DBAdd(new Student(name,grupa,ocenka));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Udalit studenta?       y/n");
        try {
            if (br.readLine().equals("y")){
                System.out.println("Vvedite indeks studenta");
                t.DBDel(Integer.parseInt(br.readLine()));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(t.show());


    }
}
