package com.company.chapterfifteen.problem;

/**
 * @author czy
 * @date 2021/1/29
 */
class FixedSizeStatic<T>{
    private int index = 0;
    private Object [] storage;

    public FixedSizeStatic(int size){
        storage= new Object[size];
    }
    public void push(T item){
        storage[index++]=item;
    }

    /**
     * 这里因为擦除的原因，编译器无法知道类型转换是否安全
     * 实际上pop方法没有执行任何转型
     * @return
     */
    @SuppressWarnings("unchecked")
    public T pop(){
        return (T)storage[--index];
    }
}
public class GenericCast {
    public static final int SIZE = 10;
    public static void main(String[] args){
        FixedSizeStatic<String> fixedSizeStack = new FixedSizeStatic<String>(SIZE);
        for (String s : "A B C D E F G H I J".split(" ")) {
            fixedSizeStack.push(s);
        }
        for (int i = 0; i < SIZE; i++) {
            String pop = fixedSizeStack.pop();
            System.out.println(pop +" ");
        }
    }
}
