package modelsHW;

import org.codehaus.groovy.ast.expr.UnaryMinusExpression;

public class TagHW {
    private String name;
    private long id;

    public TagHW(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
