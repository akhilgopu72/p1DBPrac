package cs4321.project1;

import cs4321.project1.tree.DivisionTreeNode;
import cs4321.project1.tree.LeafTreeNode;
import cs4321.project1.tree.SubtractionTreeNode;
import cs4321.project1.tree.AdditionTreeNode;
import cs4321.project1.tree.MultiplicationTreeNode;
import cs4321.project1.tree.UnaryMinusTreeNode;

/**
 * Provide a comment about what your class does and the overall logic
 * 
 * @author Rong Tan (rt389) and Akhil Gopu (akg68)
 */

public class EvaluateTreeVisitor implements TreeVisitor {
	private int result;
	private Stack aStack;
	
	public EvaluateTreeVisitor() {
		result = 0;
		aStack = new Stack();
		// TODO fill me in
	}

	public double getResult() {
		// TODO fill me in
		return result; // so that skeleton code compiles
	}

	@Override
	public void visit(LeafTreeNode node) {
		// TODO fill me in
	}

	@Override
	public void visit(UnaryMinusTreeNode node) {
		if (node.getChild() instanceof LeafTreeNode)
			aStack.push(((LeafTreeNode)node.getChild()).getData() * -1.0);
		// TODO fill me in
	}

	@Override
	public void visit(AdditionTreeNode node) {
		// TODO fill me in
	}

	@Override
	public void visit(MultiplicationTreeNode node) {
		// TODO fill me in
	}

	@Override
	public void visit(SubtractionTreeNode node) {
		// TODO fill me in
	}

	@Override
	public void visit(DivisionTreeNode node) {
		// TODO fill me in
	}
}
