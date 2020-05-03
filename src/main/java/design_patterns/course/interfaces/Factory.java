package design_patterns.course.interfaces;

import java.util.function.Supplier;

public interface Factory<T> extends Supplier<T> {
    default T newInstance() {
        return get();
    }

    static <T> Factory<T> createFactory(Supplier<T> supplier) {
        T t = supplier.get();
        return () -> t;
    }
}
