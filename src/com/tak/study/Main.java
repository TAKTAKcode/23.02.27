package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b + c);

    }

}


//정답으로 제출한 것
//위의 코드는 런타임에러가 나서 해결 중
//import java.util.*;
//        import java.io.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.nextLong() + sc.nextLong() + sc.nextLong());
//    }
//}