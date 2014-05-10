package org.cloud.test.c1;

public class Tree {

	private TreeNode root_node;
	private TreeNode Tree_listnode;
	private TreeNode Tree_listHead;
	public TreeNode getRoot_node() {
		return root_node;
	}

	public void setRoot_node(TreeNode root_node) {
		this.root_node = root_node;
	}

	public void sumNode(TreeNode node, int sum, int[] path, int top) {
		path[top++] = node.getNodevalue();
		sum -= node.getNodevalue();
		if (node.getLeftNode() == null && node.getRightNode() == null) {
			if (sum == 0)
				printPaths(path);
		} else {
			if (node.getLeftNode() != null)
				sumNode(node.getLeftNode(), sum, path, top);
			if (node.getRightNode() != null)
				sumNode(node.getRightNode(), sum, path, top);
		}
		top--;
		sum += node.getNodevalue();

	}

	private void printPaths(int[] path) {
		System.out.println();
		for (int i = 0; i < path.length; i++) {
			System.out.print("===" + path[i]);
		}
		System.out.println();
	}
	public void addNode(TreeNode node) {
		if (root_node == null) {
			this.root_node = node;
			return;
		}
		TreeNode tempNode = this.root_node;

		while (true) {
			if (node.getNodevalue() > tempNode.getNodevalue()) {
				if (tempNode.getRightNode() == null) {
					tempNode.setRightNode(node);
					return;
				} else {
					tempNode = tempNode.getRightNode();
					continue;
				}
			}else if(node.getNodevalue()< tempNode.getNodevalue()){
				if (tempNode.getLeftNode() == null) {
					tempNode.setLeftNode(node);
					return;
				} else {
					tempNode = tempNode.getLeftNode();
					continue;
				}

			}else{
				return;
			}
		}

	}

	public TreeNode getHeahNode() {
		TreeNode node = this.root_node;
		while (true) {
			if (node.getLeftNode() != null) {
				node = node.getLeftNode();
				continue;
			}
			return node;
		}
	}

	public TreeNode getTailNode() {
		TreeNode node = this.root_node;
		while (true) {
			if (node.getRightNode() != null) {
				node = node.getRightNode();
				continue;
			}
			return node;
		}
	}
	

	public void changeTreeToLink(TreeNode node) {
		if (node == null)
			return;
		if (node.getLeftNode() != null) {
			changeTreeToLink(node.getLeftNode());
		}
		node.setLeftNode(Tree_listnode);
		if (Tree_listnode == null) {
			Tree_listHead = node;
		} else {
			Tree_listnode.setRightNode(node);
		}
		Tree_listnode = node;
		if (node.getRightNode() != null) {
			changeTreeToLink(node.getRightNode());
		}

	}

	public TreeNode changeToLink() {
		this.changeTreeToLink(this.root_node);
		return Tree_listHead;

	}
	
	public synchronized void print() {
		  if (null == this.root_node) {
		   System.out.print("HashCode: " + this.hashCode() +  "; 空树;");
		   return;
		  }
		  System.out.print("HashCode: " + this.hashCode() +  "; 树: ");
		  print(this.root_node);
		  System.out.println();
		 }
		 
		 private void print(TreeNode node) {
		  if (null != node) {
		   print(node.getLeftNode());
		   System.out.print(node.getNodevalue() + " ");
		   print(node.getRightNode());
		  }
		 }

	private void prints(TreeNode node) {
		if (null != node) {
			System.out.print(node.getNodevalue() + " ");
			prints(node.getRightNode());
		}
	}

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.addNode(new TreeNode(10));
		tree.addNode(new TreeNode(6));
		tree.addNode(new TreeNode(14));
		tree.addNode(new TreeNode(4));
		tree.addNode(new TreeNode(8));
		tree.addNode(new TreeNode(12));
		tree.addNode(new TreeNode(16));
		tree.addNode(new TreeNode(18));
		tree.addNode(new TreeNode(20));
		tree.print();
		tree.sumNode(tree.root_node, 20, new int[6], 0);
		TreeNode node = tree.changeToLink();
		tree.prints(node);

	}

}
