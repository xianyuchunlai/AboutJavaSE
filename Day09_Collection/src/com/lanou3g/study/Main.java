package com.lanou3g.study;

import java.util.ArrayList;
import java.util.List;
//import java.util.*;


public class Main {
    public static void main(String[] args) {
        /*
        psvm  main方法的快捷键
        sout 输出语句的快捷键
         */
        /*
            集合
            什么是集合？

            在使用数组时，发现数组的长度
            在初始化的就定义好了，不可改变

            这时候我们来学习一下集合
            集合也可以装载一些元素
            并且，集合的大小，是可以改变的
         */

        //这就是创建类一个集合对象
        List list = new ArrayList();

        //通过观察发现，List是一个接口
        //那么ArrayList一定是List接口的一个实现类

        //java中，只能单继承
        //但是java中支持多实现
        //多实现：一个类可以实现多个接口
        //    多个接口之间通过逗号分隔


        System.out.println(list.size());

        //length
        // 数组的长度。是一个属性

        // length()
        // 是字符串的长度，是一个方法

        // size()
        //是集合的方法，获取集合的长度

//        System.out.println("sbcde".length());
//        String [] a =new String[10];
//        System.out.println(a.length);


        //给集合添加一个元素
        //add方法可以接收任意类型的对象
        list.add("zhngsan");
        list.add(new Student());
        list.add(1);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {

            Object o = 1;

            Object obj = list.get(i);

            //i =2         1

            System.out.println(
                    "第" + i + "个元素的值为" + obj);
            //调用了obj的toString方法.toString())
        }

        // Object[] objs ={1,2,"您好",args};

    /*
     * 基本数据类型包装类
     * 八大基本数据类型，每个数据类型都有一个包装类
     * 包装类，其实就是一个class，就是一个类型
     *
     * 可以创建该类型的对象
     *
     * 对应关系
     *
     * int Integer
     * char Character
     * byte Byte
     * short Short
     * long Long
     * float Float
     * double Double
     * boolean Blooean
     *
     * 除了int 和char其他的都是基本数据类型的大驼峰结构
     *
     * 自动拆箱和自动装箱
     * Integer a = 1;//自动装箱
     *              //a = new Integer(1);
     * int b =a;//自动拆箱
     */
        Integer a = 1;
        a.toString();
        int b = a;


        Object obj = 1;
        System.out.println(obj.getClass().getName());

    }

}

