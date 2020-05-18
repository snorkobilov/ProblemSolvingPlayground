package design_patterns_course.visitor;

public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
