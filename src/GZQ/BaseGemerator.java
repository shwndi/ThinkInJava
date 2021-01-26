//package GZQ;
//
///**
// * @author czy
// * @date 2021/1/26
// */
//public class BaseGemerator<T> implements Gemerator<T> {
//    private Class<T> type;
//
//    public BaseGemerator(Class<T> type) {
//        this.type = type;
//    }
//
//    @Override
//    public T newClass() {
//        try {
//            return type.newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static <T> BaseGemerator<T> create(Class<T> type) {
//        return new BaseGemerator<>(type);
//    }
//}
