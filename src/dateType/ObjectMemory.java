package dateType;

import com.company.chapterfourteen.individual.Cat;
import org.openjdk.jol.info.ClassLayout;
/**
 * @author czy
 * @date 2021/1/21
 */
public class ObjectMemory {
    public static void main(String[] args) {
        Object o = new Object();
        Cat cat = new Cat();
        System.out.println(ClassLayout.parseInstance(cat).toPrintable());
        System.out.println(Integer.toHexString(cat.hashCode()));
        synchronized (cat){
        System.out.println(ClassLayout.parseInstance(cat).toPrintable());
            System.out.println(Integer.toHexString(cat.hashCode()));
        }
    }
}
