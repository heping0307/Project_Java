package com.nowcoder.community.train;

import java.util.Arrays;

class QuickSort{

    //交换data数组 i和j的位置
    static void reverse(int[] data, int i, int j ){
        int temp;
        temp = data[j];
        data[j] = data[i];
        data[i] = temp;
    }

    //快速排序算法    data数组快速排序，start和end对应数组下标
    static void Quick(int[] data, int start, int end ){
        if(start < end){
            int base = data[start];     //基准
            int low = start;            //遍历开始
            int high = end;             //遍历结束
            while(true){
                while(high > low && base <= data[high]){  //从右到左搜索比base小的数
                    high--;
                }
                while(high > low && base >= data[low]){   //从左到右搜索比base大的数
                    low++;
                }
                if(low < high){
                    reverse(data, low, high);
                }else{
                    break;
                }
            }

            reverse(data,start,low);

            Quick(data,start,low-1);				//递归调用
            Quick(data,low+1,end);
        }
    }
}


public class Meituan_1 {
    public static void main(String[] args){
        int[] arr = new int[]{7,4,2,3,8};
        System.out.println(Arrays.toString(arr));
        QuickSort.Quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

//        int[] arr1 = new int[]{3,7,3,1,5,9};
//        System.out.println(Arrays.toString(arr1));
//        QuickSort.Quick(arr1,0,arr.length-1);
//        System.out.println(Arrays.toString(arr1));

    }
}
