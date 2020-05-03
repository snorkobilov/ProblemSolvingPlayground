package design_patterns.course.Registry;

import design_patterns.course.interfaces.Factory;

@FunctionalInterface
public interface Builder<T> {
    void register(String label, Factory<T> factory);
}
