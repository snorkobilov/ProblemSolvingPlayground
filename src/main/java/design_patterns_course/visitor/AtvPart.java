package design_patterns_course.visitor;

public interface AtvPart {
    void accept(AtvPartVisitor visitor);
}
