package com.javatraining.Collections;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonExample {
    public static void main(String[] args){
        JSONParser parser = new JSONParser();
        try {
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("/home/sb-sandeep/IdeaProjects/Java-Training/Software/src/com/javatraining/Collections/PersonDetails.json"));

            for (Object o : jsonArray) {
                JSONObject person = (JSONObject) o;
                System.out.println(person);

                String strName = (String) person.get("name");
                System.out.println("Name::::" + strName);

                String strCity = (String) person.get("city");
                System.out.println("City::::" + strCity);

                JSONArray arrays = (JSONArray) person.get("cars");
                for (Object object : arrays) {
                    System.out.println("cars::::" + object);
                }
                String strJob = (String) person.get("job");
                System.out.println("Job::::" + strJob);
                System.out.println();

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
