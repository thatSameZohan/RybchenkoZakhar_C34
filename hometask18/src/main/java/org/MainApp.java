package org;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        List<Worker> workers= List.of(
                new Worker(1000, Profession.DEVELOPER),
                new Worker(1200, Profession.DESIGNER),
                new Worker(2000, Profession.DEVELOPER),
                new Worker(3000, Profession.DEVELOPER),
                new Worker(2000, Profession.DESIGNER),
                new Worker(2500, Profession.DEVELOPER),
                new Worker(3500, Profession.TEAMLEAD),
                new Worker(1800, Profession.DESIGNER),
                new Worker(2700, Profession.DEVELOPER),
                new Worker(1600, Profession.DEVELOPER));


        Map<Profession,Double> average=workers.stream()
                .collect(Collectors.groupingBy(worker -> worker.getProfession(), Collectors.averagingDouble(worker->worker.getSalary())));
        System.out.println(average);

        Map<Profession,Long>quantity= workers.stream()
                .collect(Collectors.groupingBy(worker -> worker.getProfession(), Collectors.counting()));
        System.out.println(quantity);

        Map<Profession,Integer> salary =workers.stream()
                .collect(Collectors.groupingBy(worker -> worker.getProfession(), Collectors.summingInt(worker->worker.getSalary())));
        System.out.println(salary);

//        OptionalDouble averageDeveloper =workers.stream()
//                .filter(worker -> worker.getProfession()==Profession.DEVELOPER)
//                .map(Worker::getSalary)
//                .mapToInt(value -> value)
//                .average();
//        System.out.println(averageDeveloper);


        



    }
}
