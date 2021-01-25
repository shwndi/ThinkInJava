package com.company.chapterfifteen;

import com.company.chapterfifteen.drinks.Generator;

/**
 * this class provide a basic realization, an object used to generate a class
 * 它具有两个特点：1 必须声明为public BasicGenerator与要处理的类不在同一包下，所以要声明为public
 * 2 必须具备默认的构造器  要创建BasicGenerator对象 只需要调用create（）方法，并传入要生成的类型
 *
 * @author czy
 * @date 2021/1/21
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}
