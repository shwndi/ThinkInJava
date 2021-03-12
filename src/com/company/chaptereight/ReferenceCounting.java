package com.company.chaptereight;

/**
 * （计数器）引用计数
 * <p>
 * 知识点：
 * private不能继承
 * 首先static分配域，表示所有类实例共用。
 * 然后final类在初始化的时候确定固定值，之后再操作该实例的时候不再改变。
 *
 * @author czy
 * @date 2020-7-23
 */
public class ReferenceCounting {
    public static void main(String[] args) {
        System.out.println("-----------------创建-----------------");
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)};
        System.out.println("----------------数组--------------------");
        System.out.println(composings);
        System.out.println("----------------遍历--------------------");
        for (Composing composing : composings) {
            System.out.println(composing);
            ;
        }
        System.out.println("----------------清除--------------------");
        for (Composing composing : composings) {
            composing.dispose();
        }
        System.out.println("----------------遍历--------------------");
        for (Composing composing : composings) {
            System.out.println(composing);
            ;
        }
//		Composing c = new Composing(shared);
//		Composing c2 = new Composing(shared);
    }
}

/**
 * 共享
 */
class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creat" + this);
    }

    public void addRef() {
        refCount++;
    }

    protected void dispose() {
        System.out.println("Shared Dispose begin" + this);
        if (--refCount == 0) {
            System.out.print("Shared Dispose end" + this);
        }
        System.out.println("\t\t" + refCount + " over");
    }

    @Override
    public String toString() {
        return "Shared{" +
                "refCount=" + refCount +
                ", id=" + id +
                '}' + getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}

/**
 * 组成
 */
class Composing {
    private Shared shared;
    private static long count = 0;
    private int i;
    private final int j = i + 1;
    private final long id = count++;

    public Composing(Shared shared) {
        System.out.println("Creat began:" + this);
        this.shared = shared;
        this.shared.addRef();
        System.out.println("Creat end:" + this);
    }

    protected void dispose() {
        System.out.println("Compose begin dispose" + this);
        shared.dispose();
        System.out.println("Compose end dispose" + this);
    }

    @Override
    public String toString() {
        String s1 = shared == null ? null : shared.getClass().getName();
        String s2 = shared == null ? null : Integer.toHexString(shared.hashCode());
        return "------\nComposing{" +
                "shared=" + shared +
                ", id=" + id +
                "}\n" + s1 + "@" + s2 + "\n" +
                getClass().getName() + "@" + Integer.toHexString(hashCode())
                + "\n-----------------";
    }
}
