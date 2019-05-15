/**
 * Cristian De Los Rios
 * CSC102
 * Dr.Hawthorne 
*/


public class TestMyBST {
	
 public static void main(String[] args) {
 // Create a BST
 BST<String> tree = new BST<>();
 tree.insert("George");
 tree.insert("Michael");
 tree.insert("Tom");
 tree.insert("Adam");
 tree.insert("Jones");
 tree.insert("Peter");
 tree.insert("Daniel");


 // Traverse tree
 System.out.print("Inorder (sorted): ");
 tree.inorder();
 System.out.print("\nPostorder: ");
 tree.postorder();
 System.out.print("\nPreorder: ");
 tree.preorder();
 System.out.print("\nThe number of nodes is " + tree.getSize());
 

 // Search for an element
 System.out.print("\nIs Tom in the tree? " +
 tree.search("Tom"));

 // Get a path from the root to Tom
 System.out.print("\nA path from the root to Tom is: ");
 java.util.ArrayList<BST.TreeNode<String>> path = tree.path("Tom");
 for (int i = 0; path != null && i < path.size(); i++)
 System.out.print(path.get(i).element + " ");

 Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
 BST<Integer> intTree = new BST<>(numbers);
 System.out.print("\nInorder (sorted): ");
 intTree.inorder();
 
 //System.out.println("number of leaf nodes in this BST: " + BST.getNumberOfLeaves(tree.root));
 //System.out.println("Nonleaf nodes in this BST: " + (tree.getSize() - BST.getNumberOfLeaves(tree.root)));
 
 Integer[] numbers1 = {3, 6, 4, 2, 7, 5, 1};
 BST<Integer> intTree1 = new BST<>(numbers1);
 System.out.print("\nPreorder sorted): ");
 intTree1.inorder();
 
 Integer[] numbers2 = {1,4,6,3,7,5,2};
 BST<Integer> intTree2 = new BST<>(numbers1);
 System.out.print("\nPostorder(sorted): ");
 intTree1.inorder();
 

 }
 }