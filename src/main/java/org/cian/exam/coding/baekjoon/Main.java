package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while (N >= 5) {
            count += N / 5;
            N /= 5;
        }

        System.out.println(count);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        BigInteger fac = new BigInteger("1");
//        int count = 0;
//
//        for(int i = 1 ; i <= N ; i++) {
//            BigInteger bigI = new BigInteger(String.valueOf(i));
//            fac = fac.multiply(bigI);
//        }
//
//        char[] numArr = String.valueOf(fac).toCharArray();
//        int numArrLength = numArr.length;
//        for(int i = numArrLength - 1 ; i >= 0  ; i--) {
//            if(numArr[i] == '0'){
//                count++;
//            }else {
//                break;
//            }
//        }
//        System.out.println(count);
    }
}
