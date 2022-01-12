
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) {
      val = x;
      left=null;
      right=null;
     }
 }
 
public class MaxDepthOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(1);
		tree.left=new TreeNode(2);
		tree.right=new TreeNode(3);
		tree.left.right=new TreeNode(4);
		System.out.println(maxDepth(tree));
	}
	public static int maxDepth(TreeNode A) {
        if(A==null) return 0;
        int l=maxDepth(A.left);
        int r=maxDepth(A.right);
        return Math.max(l,r)+1;
        
    }

}
