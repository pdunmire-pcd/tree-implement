public class Traversal {
  public static void main(String[]args){
    TreeNode<Integer> root= new TreeNode<> (10);

    root.left = new TreeNode<>(9);
    root.left.left = new TreeNode<>(5);
    root.left.right = new TreeNode<>(2);

    root.right = new TreeNode<>(15);
    root.right.left = new TreeNode<>(-3);
    root.right.right = new TreeNode<>(5);
    root.right.right.right = new TreeNode<>(22);

    //preorder(root);
    //postorder(root);
    //inorder(root);

    //printGreaterThan(root, 2);

    TreeNode<String> stringRoot= new TreeNode<String> ("silly");

    stringRoot.left = new TreeNode<>("angry");
    stringRoot.left.left = new TreeNode<>("encardecantly happy");
    stringRoot.left.right = new TreeNode<>("happy");

    stringRoot.right = new TreeNode<>("sad");
    stringRoot.right.left = new TreeNode<>("excited");
    stringRoot.right.right = new TreeNode<>("confused");
    stringRoot.right.right.right = new TreeNode<>("surprised");

    //preorder(stringRoot);
    //postorder(stringRoot);
    //inorder(stringRoot);

    System.out.println(countNodes(stringRoot));

  }

  public static int countNodes(TreeNode<?> current){
    //bool?iftrue:else;
    return current == null ? 0 : countNodes(current.left) + countNodes(current.right) + 1;
  }

  //Do a preorder traversal
  // But ONLY PRINT the nodes that are greater than our threshold (10)
  public static void printGreaterThan(TreeNode<Integer> current, int threshold){
    if(current == null)return;

    if(current.data > threshold){
      System.out.println(current.data);
    }

    printGreaterThan(current.left, threshold);
    printGreaterThan(current.right, threshold);
  }

  public static void preorder(TreeNode<?> current){
    if(current == null)return;
    System.out.println(current.data);

    preorder(current.left);
    preorder(current.right);
  }

  public static <E> void postorder(TreeNode<E> current){
    if(current == null)return;

    postorder(current.left);
    postorder(current.right);
    E myData = current.data;
    System.out.println(myData);
  }

  public static void inorder(TreeNode<?> current){
    if(current == null)return;

    inorder(current.left);
    System.out.println(current.data);
    inorder(current.right);
  }
}

