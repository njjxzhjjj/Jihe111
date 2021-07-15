package com.hp.jihe;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 */
public class JiheTest02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("$");
        list.add("2");
        list.add("$");
        list.add("3");
        list.add("$");
        list.add("4");
        System.out.println("list = " + list);

        //使用迭代器遍历集合，并在过程中删除所有的"$"
        Iterator<String> iterator = list.iterator();
        // 就是 问有没有 下一个
        while (iterator.hasNext()) {
            if ("$".equals(iterator.next())) {
                iterator.remove();
            }
        }
        System.out.println("list = " + list);
    }
}
