package Section2;

import java.util.HashMap;

public class TestHashMap {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

    capitalCities.put("Jordan", "Amman");
    capitalCities.put("Palestine", "Al Qud");
    capitalCities.put("Iraq", "Bagdad");


    System.out.println(capitalCities);
    System.out.println(capitalCities.get("Jordan"));


   



    }
    
}
