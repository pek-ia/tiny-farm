package com.example.tinyfarm.fileio;

import com.example.tinyfarm.FarmAnimal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class FarmFileManager {

    private String saveFileName = "src/main/resources/animals.csv";

    public void saveAnimalsToFile(List<FileSavable> animals){
        try {
            FileWriter fw = new FileWriter(saveFileName);
            BufferedWriter bw = new BufferedWriter(fw);

            for (FileSavable a: animals){
                // save each animal to the file
                bw.write(a.asFileString());
                bw.write("\n");
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
