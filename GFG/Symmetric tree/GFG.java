class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        if(root!=null)
            return helper(root.left, root.right);
        return true;
    }
    public static boolean helper(Node p, Node q){
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        if(p.data!=q.data)
            return false;
            
        return helper(p.left, q.right) && helper(p.right, q.left);
    }
}
