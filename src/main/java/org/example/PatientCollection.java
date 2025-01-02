package org.example;

import java.util.HashSet;
import java.util.Set;

public interface PatientCollection {
    public Set<Patient> patients = new HashSet<>();

    void addPatient ( Patient p ) ; // À compl éter
    void removePatient ( Patient p ) ; // À compl éter
    Patient findPatientById (int id ) ; // À compl éter
    void displayAllPatients () ; // À compl éter
}