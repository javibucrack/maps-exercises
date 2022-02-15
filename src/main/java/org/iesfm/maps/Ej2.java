package org.iesfm.maps;

import org.iesfm.maps.exceptions.NifNotFoundException;

import java.util.Map;

public class Ej2 {

    private int tlfByNif(Map<String, User> usersByNif, String nif) throws NifNotFoundException {
        if (!usersByNif.containsKey(nif)) {
            throw new NifNotFoundException();
        }
        User user = usersByNif.get(nif);
        return user.getTlf();
    }
}
