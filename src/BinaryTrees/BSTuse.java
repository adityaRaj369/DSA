package BinaryTrees;

public class BSTuse {

	public static void main(String[] args) {
		BST b=new BST();
		b.insert(5);
		b.insert(2);
		b.insert(3);
		b.insert(7);
		b.insert(1);
		b.insert(6);
		b.insert(8);
		b.printTree();
		System.out.println(b.isPresent(5));
		b.deleteData(5);
		System.out.println(b.isPresent(5));
		b.printTree();
		b.deleteData(3);
		System.out.println(b.isPresent(3));
		b.printTree();
		System.out.println(b.size());
		

	}

}
