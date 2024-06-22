package ch8.maps;

import java.util.*;
//με το HashMap δεν εχουμε συγκεκριμενο ordering
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("GR", "Greece");
        countries.put("FR", "France");
        countries.put("USA", "United States of America");
        countries.put("IT", "Italy");

        //1ος τροπος - διασχιση
        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        System.out.println();

        //2ος τροπος - διασχιση
        for (Map.Entry<String, String> entry : countries.entrySet()){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        System.out.println();

        //3ος τροπος - διασχιση
        countries.forEach((k, v) -> System.out.println(k + "\t" + k));

        System.out.println();

        //1ος τροπος διαγραφης με iterator και εμφανιση
        Iterator<Map.Entry<String, String>> it2 = countries.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, String> entry = it2.next();
            if (entry.getKey().equals("FR")){
                it2.remove();
            }
        }
        countries.forEach((k, v) -> System.out.println(k + "\t" + k));

        System.out.println();

        //2ος τροπος διαγραφης με iterator και εμφανιση
        Iterator<Map.Entry<String, String>> it3 = countries.entrySet().iterator();
        List<String> toBeRemoved = new ArrayList<>();
        while (it3.hasNext()) {
            Map.Entry<String, String> entry = it3.next();
            if (entry.getKey().matches("[A-Z]{2}")){
                toBeRemoved.add(entry.getKey());
            }
        }
        toBeRemoved.forEach(countries::remove);
        countries.forEach((k, v) -> System.out.println(k + "\t" + k));
    }
}
