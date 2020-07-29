package TreeDatastructure;

public class BinaryTree {
	
	Node root;
	
	BinaryTree(int key){
		
		root = new Node(key);
	}
	
	BinaryTree(){
		
		root = null;
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		System.out.println(tree.root = new Node(1));
		System.out.println(tree.root.left=new Node(2));
		System.out.println(tree.root.right=new Node(3));
		System.out.println(tree.root.left.left=new Node(4));

	}

}
