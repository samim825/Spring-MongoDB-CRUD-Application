package com.spring.joblisting.model;

public class Address {

    private String thana;
    private String zilla;

    public String getThana() {
        return thana;
    }

    public void setThana(String thana) {
        this.thana = thana;
    }

    public String getZilla() {
        return zilla;
    }

    public void setZilla(String zilla) {
        this.zilla = zilla;
    }

    public Address(String thana, String zilla) {
        this.thana = thana;
        this.zilla = zilla;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "thana='" + thana + '\'' +
                ", zilla='" + zilla + '\'' +
                '}';
    }
}
