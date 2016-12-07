package com.training.clinic;

import com.training.clinic.entity.Visit;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {

        LocalDateTime localDateTime;
        localDateTime = LocalDateTime.of(2016, 01, 12, 12, 34);

        Visit visit = new Visit(1, localDateTime);
        Visit visit1 = new Visit(2, LocalDateTime.of(2016, 12, 12, 13, 47, 59));
        Visit visit2 = new Visit(3, LocalDateTime.now());

        List<Visit> visitList = new ArrayList<>();

        visitList.add(visit);
        visitList.add(visit1);
        visitList.add(visit2);

        System.out.println(visitList);


    }
}
