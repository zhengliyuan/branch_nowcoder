package com.zly.www;

public class Test001 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        b = a+b-(a=b);
        System.out.print(a);
        System.out.println(b);
    }
    public void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
