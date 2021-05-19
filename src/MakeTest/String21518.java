package MakeTest;

/**
 * @author czy
 * @date 2021/5/18
 */
public class String21518 {
    public static void main(String[] args) {
        String a = "sta_run"+"2021-05-31"+"2021-05-31"+"abcd";
        System.out.println(a.indexOf("b"));
        String s = a.substring(27);
        System.out.println(s);
        System.out.println(a.length());
        System.out.println(a.substring(33));
    }
}
