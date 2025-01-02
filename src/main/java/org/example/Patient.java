package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@Data
 @NoArgsConstructor
 @AllArgsConstructor
 public class Patient extends Person implements Comparable < Patient > {

    private int Id;
 private int socialSecurityNumber ;
 private String ailment ;
 private String name;

        @Override
 public void displayInfo () {
        System.out.println("Patient infos :");
        System.out.println("Name: " + name);
        System.out.println("Social Security Number: " + socialSecurityNumber);
        System.out.println("Ailment: " + ailment);
       }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.Id, other.Id);
    }



    public static void getPatientsByAilment(String ailment, List<Patient> patients) {
        boolean found = false;
        for (Patient patient : patients) {
            if (patient.getAilment().equalsIgnoreCase(ailment)) {
                System.out.println("Patient's socialSecurityNumber: " + patient.getSocialSecurityNumber() + ", Patient's ailment: " + patient.getAilment());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No patients found with that ailment.");
        }
    }



    public static void sortPatientsByName(List<Patient> patients)
    {
        Collections.sort(patients);
        System.out.println("Patients sorted by name:");
        for(int i =0 ;i<= patients.size();i++)
        {
            Patient patient = patients.get(i);
            System.out.println("Patient's name: " + patient.getName());
        }
    }
}


