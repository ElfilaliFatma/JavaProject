package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Patient> patients = new HashSet<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a Patient");
            System.out.println("2. Display Patients by Ailment");
            System.out.println("3. Sort Patients by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter patient's name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter patient's social security number: ");
                    int ssn = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter patient's ailment: ");
                    String ailment = sc.nextLine();


                    int id = patients.size() + 1;
                    Patient newPatient = new Patient(id, ssn, ailment, name);
                    patients.add(newPatient);
                    System.out.println("Patient added successfully.");
                    break;

                case 2:
                    System.out.print("Enter ailment to search for: ");
                    String searchAilment = sc.nextLine();
                    Patient.getPatientsByAilment(searchAilment, patients);
                    break;

                case 3:
                    Patient.sortPatientsByName(patients);
                    System.out.println("Patients sorted by name.");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }
}
