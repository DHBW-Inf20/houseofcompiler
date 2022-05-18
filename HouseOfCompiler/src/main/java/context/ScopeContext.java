package context;

import java.util.HashMap;
import java.util.Stack;

import common.Type;
import semantic.exceptions.AlreadyDefinedException;
import syntaxtree.statements.LocalVarDecl;
import syntaxtree.structure.MethodParameter;

public class ScopeContext {

    private Stack<HashMap<String, Type>> localVars;

    public ScopeContext() {
        localVars = new Stack<HashMap<String, Type>>();
    }

    public void addLocalVar(String name, Type type) {
        if (this.contains(name)) {
            throw new AlreadyDefinedException("Variable " + name + " already exists in this scope");
        }
        localVars.peek().put(name, type);
    }

    public void clear() {
        localVars.clear();
    }

    public void pushScope() {
        localVars.push(new HashMap<String, Type>());
    }

    public void popScope() {
        localVars.pop();
    }

    public Type getLocalVar(String name) {
        for (HashMap<String, Type> map : localVars) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
        }
        return null;
    }

    public boolean contains(String name) {
        for (HashMap<String, Type> map : localVars) {
            if (map.containsKey(name)) {
                return true;
            }
        }
        return false;
    }

    public void addLocalVar(LocalVarDecl localVarDecl) {
        addLocalVar(localVarDecl.getIdentifier(), localVarDecl.getType());
    }

    public void addLocalVar(MethodParameter parameter) {
        addLocalVar(parameter.getIdentifier(), parameter.getType());
    }

}
