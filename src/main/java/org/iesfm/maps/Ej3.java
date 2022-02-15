package org.iesfm.maps;

import org.iesfm.maps.exceptions.NifNotFoundException;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Ej3 {
    // throws NifNotFoundException si queremos lanzar la excepción
    private List<Integer> tlfByNif(Map<String, User> usersByNif) {
        List<Integer> tlfList = new LinkedList<>();
//        if (!usersByNif.containsKey(nif)) {
//            throw new NifNotFoundException();
//        }
        for (User user : usersByNif.values()) {
            tlfList.add(user.getTlf());
        }
        return tlfList;
    }
}