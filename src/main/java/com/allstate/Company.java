package com.allstate;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by localadmin on 03/01/17.
 */
public class Company {
    private List<Office> offices;

    public Company(List<Office> offices) {
        this.offices = offices;
    }

    public List<Office> findLocation(String location){
        return offices.stream()
                .filter(office -> office.getLocation() == location)
                .collect(Collectors.toList());
    }

    public List<Office> getLessThan10Employees(){
        return offices.stream()
                .filter(office -> office.getNumberOfEmployees() < 10)
                .collect(Collectors.toList());
    }

    public List<Office> getMoreThan100Employees(){
        return offices.stream()
                .filter(office -> office.getNumberOfEmployees() > 100)
                .collect(Collectors.toList());
    }

    public List<Office> getListOfNetherLand(){
        return offices.stream()
                .filter(office -> office.getName() == "NetherLand")
                .collect(Collectors.toList());
    }

//    public List<Office> getListOfNameFromAToK(){
//        return offices.stream()
//                .filter(office -> office.getName().charAt(0) >='A' && office.getName().charAt(0) <= 'K')
//                .collect(Collectors.toList());
//    }

    public List<Office> getListOfNameFromAToK(){
        return offices.stream()
                .filter(office -> office.getName().matches("(?i)^[a-k].*"))
                .collect(Collectors.toList());
    }

//    public List<Office> getListOfNameStartWithVowelOrMoreThan15Employees(){
//        return offices.stream()
//                .filter(office -> (office.getName().charAt(0) == 'A' || office.getName().charAt(0) == 'E' || office.getName().charAt(0) == 'I' || office.getName().charAt(0) == 'O' || office.getName().charAt(0) == 'U')|| office.getNumberOfEmployees() >= 15)
//                .collect(Collectors.toList());
//    }

    public List<Office> getListOfNameStartWithVowelOrMoreThan15Employees(){
        return offices.stream()
                .filter(office -> office.getName().matches("(?i)^[aeiou].*") || office.getNumberOfEmployees() >= 15)
                .collect(Collectors.toList());
    }
}
