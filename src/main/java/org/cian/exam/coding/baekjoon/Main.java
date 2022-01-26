package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] inputArr = br.readLine().split(" ");
        char[] nArr = inputArr[0].toCharArray();
        int nArrLength = nArr.length;
        int B = Integer.parseInt(inputArr[1]);
        long num = 0;

        for(int i = nArrLength - 1 ; i >= 0 ; i--) {
            if(nArr[i] >= '0' && nArr[i] <= '9'){
                num += (nArr[i] - 48) * (long)Math.pow(B, nArrLength - 1 - i);
            }else {
                num += (nArr[i] - 55) * (long)Math.pow(B, nArrLength - 1 - i);
            }
        }

        System.out.println(num);
    }
}
