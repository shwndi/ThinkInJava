package GZQ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author czy
 * @date 2021/1/26
 */
public class Example{
    private static int count = 1;
    private final long i = count++;

    public Example() {
    }

    @Override
    public String toString() {
        return "Example{" +
                "i=" + i +
                '}';
    }

    /**
     * 这个发生器函数是关键，要获取对象先获取生成器，通过生成器得到对象
     * 匿名内部类
     * @return
     */
    public static  Gemerator<Example> generator (){
        return new Gemerator<Example>() {
            @Override
            public Example newClass() {
                return new Example();
            }
        };
    }

    public static void main(String[] args) {
        List<Example> list = new ArrayList();
        Collection<Example> fill = Generators.fill(list, Example.generator(), 5);
        System.out.println(fill);
        /*********** Simple **********/
        /**
         * 首先生成构造器
         * 然后创建对象（上面的添加了循环生成了多个对象的过程，下面的是单个无循环逻辑的）
         */
        Gemerator<Example> generator = Example.generator();
        Example example = generator.newClass();
        System.out.println(example);
    }
}
