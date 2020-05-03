package design_patterns.course.visitor;

import java.util.function.Function;

public interface VisitorBuilder<R> {
    <T> void register(Class<?> type, Function<T, R> function);
}
