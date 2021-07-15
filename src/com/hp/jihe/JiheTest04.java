package com.hp.jihe;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 */
public class JiheTest04 {
    public static void main(String[] args) {
        //创建一个List集合并添加元素0-9
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++) {
            //把i添加进去
            list.add(i);
        }
        System.out.println("添加的元素为" + list);

        //获取子集[3,4,5,6]
        List<Integer> subList = list.subList(3, 7);
        System.out.println("获取的子集为" + subList);

        //将子集元素扩大10倍
        for(int i=0;i<subList.size();i++) {
            /*
             * int num = subList.get(i);
             * num = num * 10;
             * subList.set(i,num);
             * 以上可以写成一步
             */
            subList.set(i, subList.get(i) * 10);
        }
        System.out.println("扩大10倍之后的结果为： " + subList);
        //输出原集合
        System.out.println("原集合为：" + list);

        //删除集合中的[7,8,9]
        list.subList(7,10).clear();
        System.out.println("删除之后的结果为" + list);
    }
}
