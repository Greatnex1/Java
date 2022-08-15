package CHP_7.ArrayList;

import java.util.ArrayList;




public class Bands {
    public static void main(String[] args) {
        ArrayList <String> band = new ArrayList<>();
        band.add("WestLife");
        band.add("Brackets");
//        band.add("Backstreets");
        band.add(1,"Backstreets");
//        band.remove(0);

        System.out.println("My fav bands are : " + band);

//        loop through the list
        int total = 0;
        for (int i = 0; i < band.size() ; i++) {
            String names = band.get(i);
            total += names.length();
        }
        System.out.println("Total of length items is = " + total );
    }



}
