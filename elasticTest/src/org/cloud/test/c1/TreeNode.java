package org.cloud.test.c1;

public class TreeNode {

	private int Nodevalue;
	private TreeNode leftNode;
	private TreeNode rightNode;

	public TreeNode(int value) {
		this.Nodevalue = value;
	}

	public int getNodevalue() {
		return Nodevalue;
	}

	public void setNodevalue(int nodevalue) {
		Nodevalue = nodevalue;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

}
