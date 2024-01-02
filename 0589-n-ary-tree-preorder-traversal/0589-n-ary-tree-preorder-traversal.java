/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root!=null){
            list.add(root.val);
            for(int i=0; i<root.children.size(); i++){
                list.addAll(preorder(root.children.get(i)));
            }
        }
        return list;
    }
}