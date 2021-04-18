package com.didi.www;

import java.util.Arrays;

/**
 * @author liyuan zheng
 * @date 2020/11/23 19:16
 */
public class Question {
    public static void main(String[] args) {
        int num = 256;
        Question question = new Question();
        System.out.println(question.getNum(num));
    }
    public int getNum(int num){
        int count = 0;
        if(num == 0){
            return count;
        }
        while(num !=0){
            if(num % 2 == 1){
                count++;
            }
            num /= 2;
        }
        return count;
    }
}
