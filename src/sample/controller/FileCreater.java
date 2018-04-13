package sample.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import java.util.List;

public class FileCreater {


    public void saveFile(List<Integer> primes, String path){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(path))){
            for (int i: primes
                 ) {pw.println(i);
            }
        }
        catch(FileNotFoundException fe){
            System.out.println("File is not created");
        }

    }



}
