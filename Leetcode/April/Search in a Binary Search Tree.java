/*Basically two a methods two approach both iterative and recursive has been shown.
This Algorithm makes use of the property of the binary search tree which states that:

The value of the root node will always be greater than the left node value
The value of the root node will always be smaller than the right node value

To be noted that this is the property of a BST(Binary Search Tree) and not a BT(Binary Tree)

Definition for a binary tree node.

 public class TreeNode
 {
    int val;     
    TreeNode left;TreeNode right;
      TreeNode() 
      {
      }
      TreeNode(int val)
      { 
        this.val = val; 
      }
      TreeNode(int val, TreeNode left, TreeNode right)
      {
        this.val = val;
        this.left = left;
        this.right = right;
      }
 }
*/

//ITERATIVE APPROACH--------------------------------------------------------------

class Solution 
{
    public TreeNode search(TreeNode root, int val) 
    { 
        if(root == null)return null;
        while (root != null && root.val !=val){
            root = val <root.val?root.left :root.right;
        }
        return root;
        
    }
}

//RECURSIVE APPROACH--------------------------------------------------------------

class Solution
{
  public TreeNode search(TreeNode root, int val)
  {
    if(root==null || root.val==val)
      return root;
    
    if(root.val>val)
      return search(root.left,val);
    
    return search(root.right, val);
  }
}
