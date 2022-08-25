package com.nowcoder.community.java_test;

import java.util.Arrays;
import java.util.Scanner;

/*
// 输入一组数据并输出
Scanner sc = new Scanner(System.in);
String str=sc.nextLine();
System.out.printf("%s\n",str);

// 输入多组数据并输出
Scanner sc = new Scanner(System.in);
String str;
while(sc.hasNextLine()){
  str = sc.nextLine();
  System.out.printf("%s\n",str);
}
 */
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //sc.next       读取到空格、换行停止
        //sc.nextLine   读取到换行停止

        //接收整数
        int nums = sc.nextInt();

        //接收字符串
        String a = sc.next();

        //接收整数一维数组
        int arr[] = new int[nums];
        for(int i = 0; i < nums; i++){
            arr[i] = sc.nextInt();
        }

        //接收字符串一维数组
        String arr1[] = new String[nums];
        for(int i = 0; i < nums; i++){
            arr1[i] = sc.next();
        }

        //接收字符串二维数组
        String arr2[][] = new String[nums][nums];
        for(int i = 0; i < nums; i++){
            for(int j = 0; j < nums; j++){
                arr2[i][j] = sc.next();
            }
        }

        //将数组转换为字符串输出
        System.out.println(Arrays.toString(arr1));

    }



    public static String mer(String a,String b, int n){
        StringBuilder aa = new StringBuilder();
        for(int i = 0; i < n; i++){
            aa.append(a.charAt(i)).append(b.charAt(i));
        }
        return  aa.toString();
    }
}
