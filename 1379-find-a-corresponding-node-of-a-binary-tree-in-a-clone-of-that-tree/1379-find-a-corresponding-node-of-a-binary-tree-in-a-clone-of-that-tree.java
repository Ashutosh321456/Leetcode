class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null) return null;

        if(original==target) return cloned;

        TreeNode leftSearch = getTargetCopy(original.left,cloned.left,target);
        if(leftSearch != null) return leftSearch;

        return getTargetCopy(original.right,cloned.right,target);
    }
}