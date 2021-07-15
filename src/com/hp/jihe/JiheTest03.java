package com.hp.jihe;

import java.util.ArrayList;

/*
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 */
public class JiheTest03 {
    public static void main(String[] args) {
        //创建一个List集合(ArrayList,LinkedList均可)
        ArrayList<String> list1 = new ArrayList<>();

        //存放元素"one","two","three","four"
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        //System.out.println("list1 = " + list1);

        //获取集合第二个元素并输出
        String s = list1.get(1);
        System.out.println("s = " + s);


        //将集合第三个元素设置为"3"
        list1.set(2, "3");
        System.out.println("list1 = " + list1);

        //在集合第二个位置上插入元素"2"
        list1.add(1,"2");
        System.out.println("list1 = " + list1);

        //删除集合第三个元素
        list1.remove(2);
        System.out.println("list1 = " + list1);
    }
}
