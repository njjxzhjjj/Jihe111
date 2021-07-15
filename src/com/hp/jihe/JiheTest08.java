package com.hp.jihe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;;

/*
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 */
public class JiheTest08 {
    public static void main(String[] args) {
       /* //修改日期显示格式为"yyyy-MM-dd"
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner str = new Scanner(System.in);
        System.out.println("请输入第一个日期(yyyy-MM-dd格式)");
        String s = str.nextLine();
        System.out.println("请输入第二个日期(yyyy-MM-dd格式)");
        String s1 = str.nextLine();
        System.out.println("请输入第三个日期(yyyy-MM-dd格式)");
        String s2 = str.nextLine();
        //转换为Date对象后存入集合
        ArrayList<Date> list = new ArrayList<>();
        Date parse = null;
        try {
            parse = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            list.add(parse);
        }
        Date parse1 = null;
        try {
            parse1 = sdf.parse(s1);
        } catch (ParseException e) {
            e.printStackTrace();
            list.add(parse1);
        }
        Date parse2 = null;
        try {
            parse2 = sdf.parse(s2);
        } catch (ParseException e) {
            e.printStackTrace();
            list.add(parse2);
        }


        //对该集合排序  sort
        Collections.sort(list);
        for (Date date : list) {
            String s5 = sdf.format(date);//格式化
        }*/

       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scan = new Scanner(System.in);
        //Date对象后存入集合
        List<Date> list = new ArrayList<Date>();
        for(int i=0;i<3;i++){
            System.out.println("请输入第:"+(i+1)+"个日期:(yyyy-MM-dd格式)");
            String str = scan.nextLine();
            //处理parse异常
            Date date = null;
            try {
                date = sdf.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            list.add(date);
        }
        //输出集合中的日期
        System.out.println("输出集合中的日期:");//初始化
        //遍历
        for(Date date : list){
            System.out.println(sdf.format(date));
        }
        //对该集合排序  sort
        Collections.sort(list);
        //排完序之后在遍历一下
        System.out.println("排序后输出集合中的日期:");
        for(Date date : list){
            System.out.println(sdf.format(date));//初始化
        }

    }
}
