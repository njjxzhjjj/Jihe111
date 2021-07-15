package com.hp.jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合后输出
 *
 */
public class JiheTest07 {
    public static void main(String[] args) {
        // 集合 ,临时集合temp存放1~10个数字
        ArrayList<Integer> list = new ArrayList<>();
        //给集合添加1~10的数字
        for (int i = 1; i < 11; i++) {
        //创建随机数
        Random random = new Random();
            int i1 = random.nextInt(10);
            //把添加 的10个数保存在order1身上   list.add(i1)   存入list集合中
            boolean order1 = list.add(i1);
            //排序
            Collections.sort(list);
        }
        System.out.println("排序后的集合为" + list);
    }

}
