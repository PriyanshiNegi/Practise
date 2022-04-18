/*
This solution is based on the inorder traversal of a tree

In-Order Traversal is when a tree is traversed from Left->Root->Right

Now as per the property of a BST(Binary Search Tree) when we traverse a BST in in-order then we get a sorted tree so we can make the use of this property.

Approach 1: That we can use is In-Order Traversal of the entire tree and keep storing these values in an ArrayList or a Stack then accordingly count till k and return 
the kth value.

Approach 2: As show below is that traverse the tree In-Orderlyy and then keep incrementing the value of the index variable and as we reach index==k
we have found our answer
*/


class Solution
{
  private int index=1;//global variable for the index
  private int ans=0;//global variable for the answer
  
  public int kthsmallest(TreeNode root, int k)//main function 
  {
    traverse(root,k);
    return ans;
  }
  
  private void traverse(TreeNode root, int k)//helper function that gives the actual value
  {
    if(root==null) return;//return back the call if the root is null
    traverse(root.left,k);//reach the leftmost node 
    if(index==k) //check if the index is equal to the value for k
    {
      ans=root.val;
    }
    index++;// keep incrementing the value of index (left will be the smallest value so we increase after that value)
    traverse(root.right,k);
  }
}
  
