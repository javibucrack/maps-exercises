package org.iesfm.maps;

import java.util.Objects;

public class User {
    private String nif;
    private int tlf;

    public User(String nif, int tlf) {
        this.nif = nif;
        this.tlf = tlf;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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
        return tlf == user.tlf && Objects.equals(nif, user.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, tlf);
    }

    @Override
    public String toString() {
        return "User{" +
                "nif='" + nif + '\'' +
                ", tlf=" + tlf +
                '}';
    }
}
