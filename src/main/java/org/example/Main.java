package org.example;

import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException {

    FileHandlerCovid f = new FileHandlerCovid();
    f.readFromFile();

    //sorter data
    
    f.printData();

    }

}