package 프로그래머스.lv1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 직사각형별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String starts = IntStream.range(0, b)
                .mapToObj(value -> IntStream.range(0, a)
                        .mapToObj(value1 -> "*")
                        .collect(Collectors.joining()))
                .collect(Collectors.joining("\n"));

        System.out.println(starts);
    }
}
