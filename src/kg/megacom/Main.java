package kg.megacom;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Student student = new Student("Бекмырза", "+996555655333", "funtik", "qwerty123", "funtik.kgz312@gmail.com");
        System.out.println(student);
        String transientJson = gson.toJson(student);
        System.out.println(transientJson);


    }
}