package org.iesfm.maps;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Ej5 {

    private List<String> getNifList(Map<String, User> tlfList) {
        List<String> nifList = new LinkedList<>();

        for (String nif : tlfList.keySet()) {
            nifList.add(nif);
        }
        return nifList;
    }
}
