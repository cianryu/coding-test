package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T ; i++) {
            String[] inputArr = br.readLine().split(" ");
            Arrays.sort(inputArr);
            int A = Integer.parseInt(inputArr[0]);
            int B = Integer.parseInt(inputArr[1]);

            int answer = 1;

        }
        System.out.println(sb);
    }
}
