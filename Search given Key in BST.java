class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || val == root.val){
        return root;
    }
    
    if(val < root.val){
        return searchBST(root.left, val);
    }else{
        return searchBST(root.right, val);
    }
    }
}
