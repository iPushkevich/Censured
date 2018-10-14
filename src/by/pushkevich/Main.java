package by.pushkevich;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<String> startText = new ArrayList<>();
        Set<String> censText = new HashSet<>();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(("src/source/1.txt"))));
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(("src/source/2.txt"))));
            String line1 = null;
            String line2 = null;
            while ((line1 = reader.readLine())!= null){
                String[] strings = line1.split(" ");
            for (String s : strings ){
                startText.add(s);
               }
            }
            while ((line2 = reader2.readLine()) != null){
                String[] strings = line2.split(" ");
                for (String s : strings){
                    censText.add(s);
                }
            }
            for (int i=0; i < startText.size();i++){
                    Iterator<String> iterator = censText.iterator(); {
                        while (iterator.hasNext()){
                            if (startText.get(i).equals(iterator.next())){
                                startText.set(i, "Cens");
                            }
                        }
                    }
                    }

            System.out.println(startText);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }