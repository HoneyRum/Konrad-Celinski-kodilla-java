package com.kodilla.test.exception.main;

import com.kodilla.test.exception.io.FileReader;

public class ExceptionModuleRunner {
    public static void main(String args[]){
        FileReader fileReader = new FileReader();
        fileReader.readFile();
    }
}
