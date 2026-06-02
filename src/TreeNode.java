public class TreeNode <T> {

    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    //TreeNode<Integer> myNode = new TreeNode<>(8, null, somwOtherNode);

    public TreeNode(T data) {
        this.data = data;
    }

    public TreeNode(T data, TreeNode<T> left) {
        this.data = data;
        this.left = left;
    }

    public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

}