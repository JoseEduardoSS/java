package com.study.jose.threads.textsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaTextSearch implements Runnable {
    private String filePath;
    private String name;

    public TarefaTextSearch(String filePath, String name) {
        this.filePath = filePath;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            var scanner = new Scanner(new File(filePath));

            var lineNumber = 1;

            while(scanner.hasNextLine()) {
                var line = scanner.nextLine();

                if(line.toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(filePath + " - " + lineNumber + " - " + line);
                }

                lineNumber++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
