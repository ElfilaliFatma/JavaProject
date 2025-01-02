package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Specialist extends Doctor {
    private String expertiseArea;
    public Specialist(String specialty, List<String> qualifications, String expertiseArea)
    {
        super(specialty, qualifications);
        this.expertiseArea=expertiseArea;
    }
}
