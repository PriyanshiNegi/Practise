/*
The approach for this algorithm is the property of the BST that states that the root value at any point of the tree will be larger than the value of the left
and smaller than the value on the right.

Example: 
                   1 (root)
                 /   \
  (left node)  0      2  (right node)
  
*/
class Solution 
{
  public TreeNode trimBST(TreeNode root, int L, int R) 
    {
      if(root.val==null)// in case the tree is already empty
        return null;
      
      if(root.val<L)//In case root has a value smaller than the lowest range given then there is no point of checking the left portion of the tree as it will be even smaller
        return trimBST(root.right,L,R);// then return the right node portion
              
       if(root.val>R)//if root value is bigger than the highest range value then let's check for a smaller left node value
         return trimBST(root.left,L,R);
      
      //in case the root value is in the range for the values then we will start recursively checking for the left and right portions 
      root.left=trimBST(root.left,L,R);
      root.right=trimBST(root.right,L,R);
      
      return root;        
    }
}
