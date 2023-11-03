package org.example;

import org.example.Covid19Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
public class FileHandlerCovid {

    private ArrayList <Covid19Data> covid19Data = new ArrayList<>();

    public FileHandlerCovid() {
    }

    public void readFromFile() {

            File file = new File("Coviddata.csv");
            try (Scanner scanner = new Scanner(file, StandardCharsets.ISO_8859_1)) {
                // læs første linje line (captions)
                scanner.nextLine();
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] values = line.split(";");
                    if (values.length == 7) {
                        String region = values[0];
                        String aldersgruppe = values [1];
                        int bekræftede = Integer.parseInt(values[2].trim());
                        int døde = Integer.parseInt(values[3].trim());
                        int indlagtePåIntensiv = Integer.parseInt(values[4  ].trim());
                        int indlagte = Integer.parseInt(values[5].trim());
                        String dato = values[6];
                        Covid19Data covid19Data1 = new Covid19Data(region, aldersgruppe, bekræftede, døde, indlagte, indlagtePåIntensiv, dato);
                        covid19Data.add(covid19Data1);
                    } else {

                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void printData(){
            for(Covid19Data d: covid19Data){
                System.out.println(d);
            }
        }
    }