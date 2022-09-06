package com.nowcoder.community.java_test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //数组长度
        int nums = sc.nextInt();

        int[] arr = new int[nums];
        for (int i = 0; i < nums; i++) {
            arr[i] = sc.nextInt();
        }

        //框的大小
        int lg = sc.nextInt();
        int[] h = ab(nums,arr,lg);
        System.out.println(Arrays.toString(h));
    }
    public static int[] ab(int nums, int[] arr, int lg){
        //最终输出
        int[] a = new int[nums-lg + 1];

        //框中的数
        int[] b = new int[lg];

        for (int i = 0; i <= nums - lg; i++) {
            //框中的数
            b = Arrays.copyOfRange(arr,i,i+lg);

            Arrays.sort(b);
            //c是数组的中位数
            double c = median(b);
            a[i] = Math.abs(b[0] - c) > Math.abs(b[lg-1] -c) ? b[0] : b[lg-1];
//            System.out.println(Arrays.toString(a));
        }
        return a;
    }

    //求数组中位数
    public static double median(int[] arr) {
        // 如果是偶数，则为中间两个数的和除以2
        if (arr.length % 2 == 0) {
            return (double) ((arr[arr.length / 2 - 1] + arr[arr.length / 2])) / 2;
        }
        // 否则就是中间这个数
        return arr[arr.length / 2];
    }
}

