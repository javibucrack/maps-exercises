package org.iesfm.maps;

import org.iesfm.maps.exceptions.NifNotFoundException;

import java.util.Map;

public class Ej4 {

    private void removeTlf(Map<String, User> usersByNif, String nif) throws NifNotFoundException {
        if (!usersByNif.containsKey(nif)) {
            throw new NifNotFoundException();
        } else {
            usersByNif.containsKey(nif);
            User user = usersByNif.remove(nif);
        }
    }
}
