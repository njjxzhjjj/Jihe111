package com.hp.jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 */
public class JiheTest06 {
    public static void main(String[] args) {
        //创建一个字符串数组:{"one","two","three"}
        String[] arr = {"one","two","three"};

        //将该数组转换为一个List集合
        List<String> list = Arrays.asList(arr);
        List<String> list1 = new ArrayList<String>();
        list1.addAll(list);
        for (String a : list1) {
            System.out.println("字符串为" + a);
        }
        System.out.println("集合为" + list1);
    }
}
