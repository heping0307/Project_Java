package com.nowcoder.community.java_test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Father {
    public static void main(String[] args) {

        ArrayList<Integer> adc = new ArrayList<>();

        //添加元素
        adc.add(32);
        adc.add(11);
        adc.add(2,3);
        adc.add(1,4);
        adc.add(32);

        //输出数组长度
        int length = adc.size();
        System.out.println(length);

        //直接输出数组，不用转换到String
        System.out.println(adc);

        //获取下标为1的数
        System.out.println(adc.get(1));

        //获取32第一次在adc中出现的索引位置，没有返回-1
        System.out.println(adc.indexOf(32));

        //升序排列
        adc.sort(Comparator.naturalOrder());
        System.out.println(adc);

        //降序排列
        adc.sort(Comparator.reverseOrder());
        System.out.println(adc);

        //截取某一片段
        List<Integer> list = adc.subList(1,3);
        System.out.println(list);

        /*
        ArrayList输出不用使用toString，可以直接输出
         */
        //判断数组中是否含有数字 11，有的话返回true，没有返回false
        boolean h = adc.contains(11);
        System.out.println(h);

        int[] arr = new int[]{1,2,3,4};
        System.out.println(arr);
    }
}
