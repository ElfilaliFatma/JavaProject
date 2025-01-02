package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Doctor extends Person {
    private String specialty;
    private List<String> qualifications;

    @Override
    public void displayInfo() {


    }


    public void getDoctorsBySpecialty(String specialty) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the specialty to search for doctors:");
        specialty = sc.nextLine();
        List<Doctor> doctors = new ArrayList<>();

        for (int i = 0; i < doctors.size(); i++) {
            {
                Doctor doctor = doctors.get(i);
                if(doctor.getSpecialty().equalsIgnoreCase(specialty))
                {
                    System.out.println("Doctor's name: " + doctor.getName() + ", Doctor's Address: " + doctor.getAddress());

                }
            }
        }
    }
}
