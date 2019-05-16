package com.px.linkedlist;

import java.util.Arrays;

public class SortDemo {

    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            //记录每次找到的最小值
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[index] >= arr[j]) {
                    index = j;
                }
            }
            if(index > i){
                swap(arr,index,i);
            }
        }
    }

    public static void quickSort(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        quickSort(arr,left,right);
    }

    private static void quickSort(int[] arr,int left,int right){
        if(left > right){
            return;
        }
        int i = left;
        int j = right;
        //将最左边的值设为基准值
        int base = arr[left];
        //只要i与j不相等就循环
        while (i != j) {
            //从又往左找出第一个比基准值小的值
            while (arr[j] >= base && i < j){
                j--;
            }
            //从左往右找出第一个比基准值大的值
            while (arr[i] <= base && i < j) {
                i++;
            }

            //执行到这说明找到了i与j匹配的值，交换i与j的值
            swap(arr,i,j);
        }
        //while循环跳出，则说明i与j相等，交换基准值与i，j所在位置的值
        swap(arr,left,i);
        //递归左边
        quickSort(arr,left,i-1);
        //递归右边
        quickSort(arr,i+1,right);

    }

    /**
     * 交换两个元素的位置
     */
    public static void swap(int[] arr,int index,int i){
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {6,2,5,2,1,3,5,6,7,4,9,1};
        int[] arr2 = {6,2,5,2,1,3,5,6,7,4,9,1};
        selectSort(arr1);
        quickSort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("----------------------");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
