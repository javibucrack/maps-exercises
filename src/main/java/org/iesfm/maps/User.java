package org.iesfm.maps;

import java.util.Objects;

public class User {
    private String nif;
    private String name;
    private String surname;
    private int tlf;

    public User(String nif, String name, String surname, int tlf) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.tlf = tlf;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return tlf == user.tlf && Objects.equals(nif, user.nif) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, tlf);
    }

    @Override
    public String toString() {
        return "User{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tlf=" + tlf +
                '}';
    }
}
