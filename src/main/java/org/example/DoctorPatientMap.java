package org.example;

import java.util.List;

public interface DoctorPatientMap {
    void addPatient(Patient p);

    void removePatient(Patient p);

    Patient findPatientById(int id);

    void displayAllPatients();

    void assignPatientToDoctor (Doctor d , Patient p ) throws
            HospitalException ; // À compl é ter
    List< Patient > getPatientsOfDoctor (Doctor d ) ; // À compl éter
    void displayAllAssignments () ; // À compl é ter
}
