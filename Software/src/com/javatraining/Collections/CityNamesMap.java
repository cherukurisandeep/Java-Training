package com.javatraining.Collections;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
public class CityNamesMap {
    public static void main(String args[]){
        String fileName = "Cities.txt";
        String line = null;
        String city[] = new String[40];
        ArrayList<String> states = new ArrayList<String>();
        try{
            System.out.println(fileName);
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            while((line = bufferReader.readLine())!= null){
                city = line.split("\\n");
                for(int i = 0; i< city.length; i++){
                    states.add(city[i]);
                }
            }
            System.out.println(states.size());
            for(String elem : states){
                System.out.println(elem);
            }
            /*for (int i =0;i<states.size();i++){
                System.out.println(Arrays.deepToString(states.get(i)));
            }*/
            bufferReader.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Unable to open file");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Ubale to read the file");
        }
    }
}
