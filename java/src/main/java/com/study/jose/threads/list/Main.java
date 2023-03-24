package com.study.jose.threads.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        var list = new Vector<String>(); // Vector é uma List synchronized/thread-safe

        for (int i = 0; i < 10; i++) {
            new Thread(new addElement(list, i)).start();
        }

        Thread.sleep(2000);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }
    }
}
