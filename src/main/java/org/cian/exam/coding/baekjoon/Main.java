package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] stairArr = new int[N+1][10];
        int result = 0;
        for(int i = 0 ; i < 10 ; i++) {
            stairArr[1][i] = 1;
        }

        for(int i = 2 ; i <= N ; i++) {
            stairArr[i][0] = 1;
            for(int j = 1 ; j <= 9 ; j++) {
                stairArr[i][j] = (stairArr[i-1][j] + stairArr[i][j-1])%10007;
            }
        }

        for(int i = 0 ; i <= 9 ; i++) {
            result += stairArr[N][i];
        }

        System.out.println(result % 10007);
    }
}

