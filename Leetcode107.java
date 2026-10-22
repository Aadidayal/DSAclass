public class Leetcode107 {
    
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
     Queue<TreeNode> q= new LinkedList<>();
     List<List<Integer>> list = new ArrayList<>();
     if(root==null){
        return list;
     }   
     q.add(root);

     while(!q.isEmpty()){
        int size= q.size();
        List<Integer> in = new ArrayList<>();
        for(int i=0; i<size; i++){
            TreeNode x = q.poll();
            in.add(x.val);
    if(x.left!=null) q.add(x.left);
    if(x.right!=null) q.add(x.right);
        }
        // list.add(0, in);
    list.add(in);
     }
     Collections.reverse(list);
     return list;
    }
}