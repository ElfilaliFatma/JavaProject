package org.example;


import java.awt.*;
import java.util.*;
import java.util.List;

public class Hospital implements DoctorPatientMap{
    private List<Patient> patients = new ArrayList<>();
    private Map<Doctor, Set<Patient>> doctorPatientMap = new HashMap<>();

    @Override
    public void addPatient(Patient p) {
        if(p!=null && !patients.contains(p)){
            patients.add(p);
            System.out.println("Patient added successfully");
        }else{
            System.out.println("Patient already exists");
        }

    }

    @Override
    public void removePatient(Patient p) {
        if(!patients.contains(p)){
            System.out.println("Patient not exists you can not delete it");
        }else{
            patients.remove(p);
            System.out.println("Patient removed: " + p.getName());
        }
    }

    @Override
    public Patient findPatientById(int id) {

        for(Patient p : patients){
            if(p.getSocialSecurityNumber() == id){
                return p;
            }
        }
        System.out.println("Patient with id "+id +"not exist");
        return null;
    }

    @Override
    public void displayAllPatients() {
        if(patients.isEmpty()){
            System.out.println("List is empty");
        }
        for(Patient p : patients){
           p.displayInfo();
        }
    }

    @Override
    public void assignPatientToDoctor(Doctor d, Patient p) throws HospitalException {
        if (d == null || p == null) {
            throw new HospitalException("Doctor or Patient cannot be null.");
        }

        doctorPatientMap.putIfAbsent(d, new HashSet<>());
        doctorPatientMap.get(d).add(p);
        System.out.println("Patient " + p.getName() + " assigned to Doctor " + d.getName());
    }


    @Override
    public List<Patient> getPatientsOfDoctor(Doctor d) {
        if (doctorPatientMap.containsKey(d)) {
            return new ArrayList<>(doctorPatientMap.get(d));
        } else {
            return new ArrayList<>();
        }
    }


    @Override
    public void displayAllAssignments() {

    }

}
