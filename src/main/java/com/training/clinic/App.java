package com.training.clinic;

import com.training.clinic.entity.Doctor;
import com.training.clinic.entity.Patient;
import com.training.clinic.entity.Visit;

import java.time.LocalDateTime;
import java.util.*;


public class App {

    public static void main(String[] args) {

        //visit test

        LocalDateTime localDateTime;
        localDateTime = LocalDateTime.of(2016, 1, 12, 12, 34);

        Visit visit = new Visit(1, localDateTime);
        Visit visit1 = new Visit(2, LocalDateTime.of(2016, 12, 12, 13, 47, 59));
        Visit visit2 = new Visit(3, LocalDateTime.now());

        List<Visit> visitList = new ArrayList<>();

        visitList.add(visit);
        visitList.add(visit1);
        visitList.add(visit2);

        System.out.println(visitList);

        //patient test

        Doctor doctorJan = new Doctor(1, "John", "Smith", "prof. dr");
        Doctor doctorBarbara = new Doctor(2, "Barbra", "White", "dr");

        Patient patientTom = new Patient(1, "Tom", "Black", "Tom@tom.com");
        Map<Visit, Doctor> tomVisits = new HashMap<>();
        tomVisits.put(visit, doctorBarbara);
        tomVisits.put(visit1, doctorBarbara);
        tomVisits.put(visit2, doctorJan);
        patientTom.setVisits(tomVisits);

        System.out.println();
        System.out.println(patientTom);


    }
}
