package com.study.jose.threads.list;
import java.util.List;

public class addElement implements Runnable {

    private List<String> list;
    private Integer thread;

    public addElement(List<String> list, Integer thread) {
        this.list = list;
        this.thread = thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            list.add("Thread " + thread + " - " +  i);
        }
    }
}
