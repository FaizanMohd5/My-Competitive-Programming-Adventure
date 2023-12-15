### ​Intuition:
1. Assume the function inorderTraversal() will give you the result no matter what.
2. Initialize a new 'ArrayList'. (initially empty)
3. If root is null then the empty ArrayList reference is returned directly.
4. if root is not empty then tell the inorderTraversal() to first find and return the list of the elements in the inorder traversal of left subtree (root.left, check before doing make sure if root.left is not null). And you just have to add all of them individually in your ArrayList object (using addAll() which is in 'List' interface)
*Your ArrayList object will now have all the elements of left subtree. How? I told you to assume that inorderTraversal() will do it.*
5. Same with right subtree if the root's right is not null.
6. Done!
