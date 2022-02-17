package org.iesfm;

import org.iesfm.maps.Ej2;
import org.iesfm.maps.Ej3;
import org.iesfm.maps.User;
import org.iesfm.maps.exceptions.NifNotFoundException;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsExercisesTest {

    @Test
    public void getPhoneByNifTest() throws NifNotFoundException {
        Map<String, User> usersByNif = createMap();

        int phone = Ej2.getPhonesByNif(usersByNif, "12345678A");

        Assert.assertEquals(610828131, phone);
    }

    @Test(expected = NifNotFoundException.class)
    public void notGetPhoneByNifTest() throws NifNotFoundException {
        Map<String, User> usersByNif = createMap();

        int phone = Ej2.getPhonesByNif(usersByNif, "123tr45678A");
    }

    @Test
    public void getPhonesTest() {
        Map<String, User> usersByNif = createMap();

        List<Integer> phones = Ej3.tlfByNif(usersByNif);

        Assert.assertEquals(3, phones.size());
        Assert.assertTrue(
                phones.containsAll(
                        List.of(
                                610828131,
                                612837485,
                                623748591
                        )
                )
        );
    }

    private Map<String, User> createMap() {
        Map<String, User> usersByNif = new HashMap<>();

        usersByNif.put("12345678A", new User("12345678A", 610828131));
        usersByNif.put("87654321B", new User("87654321B", 612837485));
        usersByNif.put("12345678C", new User("12345678C", 623748591));
        return usersByNif;
    }
}
