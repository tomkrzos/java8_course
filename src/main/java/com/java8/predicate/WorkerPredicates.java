package com.java8.predicate;

import com.java8.core.data.Profession;
import com.java8.core.data.Worker;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WorkerPredicates {

    private static final int ADULT_AGE = 20;

    public static Predicate<Worker> isAdult() {
        return p -> p.getAge() > ADULT_AGE;
    }

    public static Predicate<Worker> isAgeMoreThan(int age) {
        return p -> p.getAge() > age;
    }

    public static Predicate<Worker> isAgeMoreThanAndProfession(int age, Profession profession) {
        return p -> p.getAge() > age && p.getProfession().equals(profession);
    }

    public static Predicate<Worker> isAgeMoreThanOrProfession(int age, Profession profession) {
        return p -> p.getAge() > age || p.getProfession().equals(profession);
    }

    public static List<Worker> filterWorkers(List<Worker> workerList, Predicate<Worker> predicate) {
        return workerList.stream().filter(predicate).collect(Collectors.toList());
    }
}
