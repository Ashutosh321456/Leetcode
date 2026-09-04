class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root,ans,arr,sum);
        return ans;
    }
        private void dfs(TreeNode root, List<List<Integer>> ans, ArrayList<Integer> arr, int sum) {
        if(root==null) return;
        arr.add(root.val);
        
        if(sum==root.val && root.left==null && root.right==null){
            ans.add(new ArrayList<>(arr));
        }
        
        dfs(root.left,ans,arr,sum-root.val);
        dfs(root.right,ans,arr,sum-root.val);
        arr.remove(arr.size()-1);
    }
}