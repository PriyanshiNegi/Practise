/*
Basically what happens is when a BST is traversed in an In-Order traversing manner then the resultant is a tree with elements arranged in ascending order which looks
something like a graph linearly incresing for a proper pictorial explaination refer the link from below take from LeetCode discuss section.

https://leetcode.com/problems/recover-binary-search-tree/discuss/1278113/Come-on-in!-No-explanation-can-be-more-straightforward-than-graph-for-this-problem

Now when the 
*/














class Solution {
    public void recoverTree(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        inorder(root, nodes);

        TreeNode node1 = null;
        TreeNode node2 = null;
        int n = nodes.size();
        for(int i = 0; i < nodes.size(); i++){
            if(i == 0){
                if(nodes.get(0).val > nodes.get(1).val) node1 = nodes.get(0);
            }else if(i == n - 1){
                if(nodes.get(i).val < nodes.get(i - 1).val) node2 = nodes.get(i);
            }else{
                if(node1 == null && nodes.get(i).val > nodes.get(i - 1).val && nodes.get(i).val > nodes.get(i + 1).val)
                    node1 = nodes.get(i);
                else if(nodes.get(i).val < nodes.get(i - 1).val && nodes.get(i).val < nodes.get(i + 1).val)
                    node2 = nodes.get(i);
            }
        }
        
        // swap val of node1 and node2, instead of node1 and node2 to keep the structure
        int tmp = node1.val;
        node1.val = node2.val;
        node2.val = tmp;
    }
    
    public void inorder(TreeNode root, List<TreeNode> nodes){
        if(root == null) return;
        
        inorder(root.left, nodes);
        nodes.add(root);
        inorder(root.right, nodes);
    }
}
