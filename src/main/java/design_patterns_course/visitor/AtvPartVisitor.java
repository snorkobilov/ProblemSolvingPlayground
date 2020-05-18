package design_patterns_course.visitor;

public interface AtvPartVisitor {
    void visit(Oil part);
    void visit(Fender part);
    void visit(Wheel part);
    void visit(PartsOrder partsOrder);
}
