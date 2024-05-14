package inbuiltfunctionalinterfaces.AcceptMoreThanOneParamOfAnyTypeAndReturnsOfAnyType;

/**
 *  It is similar to Function interface present in java.util.function
 * @param <T>
 * @param <U>
 * @param <R>
 */
public interface MyInterface<T,U,R> {

    public abstract R someName(T t,U u);
}
