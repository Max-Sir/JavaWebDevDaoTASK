package net.epam.study.entity;

import java.util.ArrayList;
import java.util.List;

public class Appliance {
    List<String> applianceList;

    @Override
    public String toString() {
        return "Appliance: " + applianceList + '.';
    }

    public Appliance(List<String> test){
        this.applianceList = test;
    }

}
