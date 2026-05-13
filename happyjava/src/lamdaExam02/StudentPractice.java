package lamdaExam02;

import java.util.*;
import java.util.stream.Collectors;

public class StudentPractice {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(

        new Student("김철수" , 85),
        new Student("이영희" , 92),
        new Student("박민수" , 78),
        new Student("정수진" , 88),
        new Student("최영수" , 95)
        );

        System.out.println("======= 80점 이상 학생 =======");
        students.stream().filter(t -> t.getScore() >= 80)
                .map(Student::getName).forEach(System.out::println);

        System.out.println("======= 반 평균 점수 =======");
        double avg = students.stream()
                .collect(Collectors.averagingInt(Student::getScore));
        System.out.printf("반평균 : %.2f", avg);

        System.out.println("\n★★★★★ 1등 ★★★★★");
        Optional<Student> first = students.stream()
                .max(Comparator.comparingInt(Student::getScore));
        first.ifPresent(
                s -> System.out.printf("1등 : %s | 점수 : %d", s.getName(), s.getScore()));


    }
}
