package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] inputArr = br.readLine().split(" ");
        int hour = Integer.parseInt(inputArr[0]);
        int min = Integer.parseInt(inputArr[1]);
        int playtime = Integer.parseInt(br.readLine());
        int pHour = playtime / 60;
        int pMin = playtime % 60;

        if(min + pMin >= 60) {
            pHour++;
            min += pMin - 60;
        }else {
            min += pMin;
        }

        if(hour + pHour >= 24) {
            hour += pHour - 24;
        }else {
            hour += pHour;
        }

        System.out.println(hour + " " + min);
    }
}

