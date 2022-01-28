package com.company;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;

interface FileTypeInterface{
    ArrayList<String> choose(String[] listOfFiles, String type);
}


public class Main {


    public static void main(String[] args) {

        File dir = new File("D:\\filefolder");
        String[] list = dir.list();

        FileTypeInterface filter = (listOfFiles, type) -> {

            ArrayList<String> result = new ArrayList<>();

            for (int i=0; i<listOfFiles.length; i++)
            {
                if (!listOfFiles[i].toLowerCase().endsWith(type)){
                    result.add(listOfFiles[i]);
                }
            }

            return result;

            };


        System.out.println("pliki bez .txt : " + filter.choose(list, ".txt"));
        System.out.println("pliki bez .png : " + filter.choose(list, ".png"));

    }
}
