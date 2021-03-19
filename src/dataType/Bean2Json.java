package dataType;

import cn.hutool.json.JSONUtil;

/**
 * @author czy
 * @date 2021-1-20
 */
public class Bean2Json {

    public static void main(String[] args) {
        class A {
            String a;

            @Override
            public String toString() {
                return "A{" +
                        "a='" + a + '\'' +
                        '}';
            }


        }
        A a = new A();
        a.a = "123";
        System.out.println(a);
        String s = JSONUtil.toJsonStr(a.toString());
        System.out.println(s);
    }
}
