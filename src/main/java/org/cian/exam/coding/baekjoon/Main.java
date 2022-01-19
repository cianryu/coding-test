package org.cian.exam.coding.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        String str = br.readLine();

        boolean pass = false;
        for(int i = 0 ; i < str.length() ; i++) {

            if(str.charAt(i) == '<') {
                while(!st.empty()){
                    sb.append(st.pop());
                }
                sb.append(str.charAt(i));
                pass = true;
            }else if(str.charAt(i) == '>') {
                sb.append(str.charAt(i));
                pass = false;
            }else {
                if(pass) {
                    sb.append(str.charAt(i));
                }else {
                    if(str.charAt(i) == ' '){
                        while(!st.empty()){
                            sb.append(st.pop());
                        }
                        sb.append(str.charAt(i));
                    }else {
                        st.push(str.charAt(i));
                    }
                }
            }
        }
        while(!st.empty()){
            sb.append(st.pop());
        }
        System.out.println(sb);
    }
}

