package design_patterns_course.interpreter;

public class InterpreterDemo {

    static Expression buildInterpreterTree(){
        Expression terminal1 = new TerminalExpression("Lions");
        var terminal2 = new TerminalExpression("Tigers");
        var terminal3 = new TerminalExpression("Bears");

        var alternation1 = new AndExpression(terminal2, terminal3);
        var alternation2 = new OrExpression(terminal1, alternation1);
        return new AndExpression(terminal3, alternation2);
    }

    public static void main(String[] args) {
//        String context = "Lions";
        String context = "Bears Lions";
//        String context = "Tigers";
//        String context = "Bears";

        Expression define = buildInterpreterTree();
        System.out.println(context+" is "+define.interpret(context));
    }
}
