// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
       
//         List<Integer> res = new ArrayList<>();
//         Stack<TreeNode> stack = new Stack<>();
//         TreeNode cur = root;

//         while (cur != null || !stack.isEmpty()) {
           
//                 stack.push(cur);
//                 stack.pop();
//                 res.add(cur.val);

//                 if(cur.right != null){
//                     stack.push(cur.right);
//                 }
//                 if(cur.left != null){
//                     stack.push(cur.left);
//                 }         
      
//         }

//         return res;
//     }
// }
  class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root); 

        while (!stack.isEmpty()) { 
            TreeNode cur = stack.pop(); 
            res.add(cur.val);       

            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }

        return res;
    }
}      
