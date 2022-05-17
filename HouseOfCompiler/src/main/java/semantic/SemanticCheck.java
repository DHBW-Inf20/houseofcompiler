package semantic;

import common.BaseType;
import common.Primitives;
import common.ReferenceType;
import common.Type;
import context.Context;
import semantic.exceptions.AlreadyDefinedException;
import semantic.exceptions.InvalidASTException;
import semantic.exceptions.TypeMismatchException;
import semantic.exceptions.TypeUnkown;
import syntaxtree.expressions.*;
import syntaxtree.statementexpression.Assign;
import syntaxtree.statementexpression.MethodCall;
import syntaxtree.statementexpression.NewDecl;
import syntaxtree.statements.*;
import syntaxtree.structure.*;
import visitor.SemanticVisitor;


public class SemanticCheck implements SemanticVisitor {
    private Context context;

    public static Program generateTast(Program program) {
        SemanticCheck semanticCheck = new SemanticCheck();
        program.accept(semanticCheck);
        return program;
    }

    private boolean compareTypes(Type type1, Type type2) {
        return (type1.equals(type2) ||
                type1.equals(new ReferenceType("Object"))) ||
                (type1.equals(new BaseType(Primitives.INT)) &&
                        type2.equals(new BaseType(Primitives.CHAR)));
    }

    private Tuple<Type, Type> typeAssign(IExpression expression1, IExpression expression2) { //where to set type of these ?

        Type typedExpression1 = expression1.getType(); //set type
        Type typedExpression2 = expression2.getType(); // set type
        if (!(typedExpression1 instanceof LocalOrFieldVar || typedExpression1 instanceof InstVar)) { //what here
            throw new InvalidASTException("Left side of the assign is not assignable");
        }
        if (!compareTypes(typedExpression1, typedExpression2)) {
            throw new TypeMismatchException("Type " + typedExpression2 + " cannot be assigned to " +
                    typedExpression1);
        }
        return new Tuple<>(typedExpression1, typedExpression2);
    }


    @Override
    public TypeCheckResult typeCheck(Program toCheck) {

        context = new Context(toCheck);


        for (ClassDecl classDecl : toCheck.getClasses()) {
            classDecl.accept(this);
        }
        System.out.println();

        return null;
    }

    @Override
    public TypeCheckResult typeCheck(ClassDecl toCheck) {
        System.out.println("ClassDecl");

        toCheck.getFieldDelcarations().forEach(field -> field.accept(this));

        if (toCheck.getConstructorDeclarations().isEmpty()) {
            new ConstructorDecl().accept(this);
        } else {
            toCheck.getConstructorDeclarations().forEach(constructor -> {
                constructor.accept(this);
            });
        }
        toCheck.getMethodDeclarations().forEach(method -> method.accept(this));

        return null;
    }

    @Override
    public TypeCheckResult typeCheck(FieldDecl toCheck) {
        if (toCheck.getType() != null) toCheck.setType(toCheck.getType()); // ???
        System.out.print(" ");
        if (toCheck.getType() != null) {
            //field.getIdentifier().accept(this);
            throw new AlreadyDefinedException("The field variable " + toCheck.getType() + " has already been defined");
        }

        return null;
    }

    @Override
    public TypeCheckResult typeCheck(ConstructorDecl toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(MethodDecl toCheck) {
        var valid = true;

        for (var parameter: toCheck.getParameters()){
            var result = parameter.accept(this);
            valid = valid && result.isValid();
        }
        var params = toCheck.getParameters();
        var methodBody = toCheck.getBlock();
        var result = methodBody.accept(this);
        return new TypeCheckResult(valid, result.getType());
    }

    @Override
    public TypeCheckResult typeCheck(Assign toCheck) {
        IExpression lExpression = toCheck.getlExpression();
        IExpression rExpression = toCheck.getrExpression();
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(MethodParameter toCheck) {
        if (TypeHelper.typeExists(toCheck.getType(),this.context))
            return new TypeCheckResult(true, toCheck.getType());

        throw new TypeUnkown("type Unkown in parameter");
    }

    @Override
    public TypeCheckResult typeCheck(WhileStmt whileStmt) {
        var condResult = whileStmt.getBlock().accept(this);
        if (!TypeHelper.isBool(condResult.getType())){
            throw new TypeMismatchException("Bool excepted");
        }
        var blockResult = whileStmt.getBlock().accept(this);

        var valid = condResult.isValid() && blockResult.isValid() && TypeHelper.isBool(condResult.getType());
        return new TypeCheckResult(valid, blockResult.getType());
    }

    @Override
    public TypeCheckResult typeCheck(ReturnStmt returnStmt) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(LocalVarDecl localVarDecl) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(IfStmt ifStmt) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(Block block) {
        var statements = block.getStatements();
        Type blockType = TypeHelper.voidType;
        var valid = true;
        for (var statement : statements) {
            var result = statement.accept(this);
            valid = valid && result.isValid();
            //blockvoid
            if (result.getType() == TypeHelper.voidType) {
                continue;
            }
            //block
            try {
                blockType = result.getType();
            } catch (TypeMismatchException e) {
                valid = false;
                throw new TypeMismatchException("inconsistent type");
            }
        }
        return new TypeCheckResult(valid, blockType);
    }


    @Override
    public TypeCheckResult typeCheck(NewDecl newDecl) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(MethodCall methodCall) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(Unary unary) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(This aThis) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(Null aNull) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(LocalOrFieldVar localOrFieldVar) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(IntegerExpr integerExpr) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(InstVar instVar) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(CharExpr charExpr) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(BoolExpr boolExpr) {
        return null;
    }

    @Override
    public TypeCheckResult typeCheck(Binary binary) {
        return null;
    }
}
