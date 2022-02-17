package org.iesfm.maps;

import java.util.HashMap;
import java.util.Map;

public class Ej1 {
    public static void main(String[] args) {
        Map<String, User> usersByNif = new HashMap<>();
        usersByNif.put("12345678A", new User("12345678A", 610828131));
        usersByNif.put("87654321B", new User("87654321B", 612837485));
        usersByNif.put("12345678C", new User("12345678C", 623748591));
    }
}
