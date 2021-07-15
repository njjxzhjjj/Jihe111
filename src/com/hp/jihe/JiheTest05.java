package com.hp.jihe;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 */
public class JiheTest05 {
    public static void main(String[] args) {
        //创建一个List集合,并添加元素0-9
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++) {
            list.add(i);
        }
        System.out.println("集合为" + list);

        //集合转为数组  将集合转换为一个Integer数组并输出数组每一个元素
        Integer[] characters = list.toArray(new Integer[list.size()]);
        System.out.println("数组为"+Arrays.toString(characters));
    }
}
