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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList();

        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        queue.offer(null);

        List<Integer> innerList = new ArrayList<>();
        
        while(!queue.isEmpty())  {
            
            TreeNode current = queue.poll();
            
            if(current == null){
                list.add(innerList);
                innerList = new ArrayList<>();
                if(!queue.isEmpty()){
                    queue.offer(null);
                }
            }
            else{
                innerList.add(current.val);
                if(current.left != null)
                    queue.offer(current.left);
                if(current.right != null)
                    queue.offer(current.right);
            }

            

        }

        return list;
    }
}
