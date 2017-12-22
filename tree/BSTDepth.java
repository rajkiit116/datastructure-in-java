package tree;

public class BSTDepth 
{
  Node root;

 int maximumDepth(Node node) 
 {
     if (node == null)
         return 0;
     else
     {
         /* compute the depth of each subtree */
         int leftDeapth = maximumDepth(node.left);
         int rightDepth = maximumDepth(node.right);

         /* use the larger one */
         if (leftDeapth > rightDepth)
             return (leftDeapth + 1);
          else
             return (rightDepth + 1);
     }
 }
   
 public static void main(String[] args) 
 {
	 BSTDepth tree = new BSTDepth();

     tree.root = new Node(1);
     tree.root.left = new Node(2);
     tree.root.right = new Node(3);
     tree.root.left.left = new Node(4);
     tree.root.left.right = new Node(5);

     System.out.println("Height of tree is : " + 
                                   tree.maximumDepth(tree.root));
 }
 
}
class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}
