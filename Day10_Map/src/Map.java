import java.awt.*;
import java.util.ArrayList;

public class Map {
    public static void main(String[] args) {
        /**
         * Map是什么？
         * 是一个接口
         * MAp也可以存放数据。
         * Map存放的数据，都是键值对形式的
         * 什么是 键值对？
         * name ="zhangSan"
         * age =1
         * gender="男"
         * 这种一一对应的关系就叫键值对
         */


        Map m = new HashMap();
        //put方法，向map中添加信息
        //括号中接收两个参数
        //第一个参数表示key（键）
        //第二个参数表示value（键）
        m.put("name", "王五");
                m.put("gender","男");
        m.put("age",11);

        //System.out.println(m.get("name"));
        System.out.println("开始遍历了");


        for (Objiect o : m.keySet()) {
            //m.keySet就是将map中的所有的key拿出来

            //增强for循环，也叫foreach

            //冒号后面，接收的是 一个集合
            //   也就是接收类一堆数据

            m.get(o).toString
        }
    }


}
