package com.group5.Car;

import java.util.ArrayList;

public class Make {
    
    private String name;
    private String country;
    private ArrayList<Model> modelList;


    public Make (String name, String country) {
        this.name = name;
        this.country = country;
    }


    public void addModeltoList (Model model) {
        modelList.add(model);
    }

    public String getName() {
        return name;
    }
    
}
