package org.cian.exam.coding.baekjoon.level.foundation1.dataStructure200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//단어뒤집기 2
public class Baek17413 {
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
