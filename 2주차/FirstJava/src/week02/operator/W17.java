package week02.operator;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt();

        for (int i = 2; i <= 9; i++) {
            if (passNum == i) {
                continue;
            }
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + " * " + j + "는 = " + i * j + "입니다.");
            }

        }

    }
}
