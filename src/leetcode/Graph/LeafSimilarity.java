package leetcode.Graph;



public class LeafSimilarity {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
     TreeNode() {}
    TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
        this.left = left;
          this.right = right;
       }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String s1 = leafSequence(root1,"");
        String s2 = leafSequence(root2, "");
        if(s1.equals(s2))
        return true;
        else return false;
     }
     public String leafSequence(TreeNode root, String sequence){
         if(root.left!=null){
            return   leafSequence(root.left, sequence);
         }
         if(root.right!=null){
           return   leafSequence(root.right, sequence);
         }
         if(root.right==null && root.left==null){
             return sequence+String.valueOf(root.val);
         }
         return sequence;
     }
 
}
