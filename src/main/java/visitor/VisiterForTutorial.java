package visitor;

import org.eclipse.core.internal.localstore.Bucket;
import org.eclipse.jdt.core.dom.*;

import java.lang.management.CompilationMXBean;
import java.util.HashSet;
import java.util.Set;

public class VisiterForTutorial extends ASTVisitor {
    CompilationUnit compilationUnit = null;
    public VisiterForTutorial(CompilationUnit compilationUnit){
        this.compilationUnit = compilationUnit;
    }
    public boolean visit(VariableDeclarationFragment node) {
        SimpleName name = node.getName();
        System.out.println(name.getNodeType());
        System.out.println("Declaration of '" + name + "' at line" + compilationUnit.getLineNumber(name.getStartPosition()));
        return false; // do not continue to avoid usage info
    }

    public boolean visit(IfStatement node) {
        System.out.println("Declaration of '" + "if" + "' at line" + compilationUnit.getLineNumber(node.getStartPosition()));
        return true;
    }

    public boolean visit(FieldDeclaration node){
        System.out.println("type is " + node.getType().toString());
        return true;
    }
}
