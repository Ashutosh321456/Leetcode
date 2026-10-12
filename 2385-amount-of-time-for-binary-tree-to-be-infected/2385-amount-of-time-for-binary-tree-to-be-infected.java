class Pair{
    TreeNode node;
    int dist;
    Pair(TreeNode node , int dist){
        this.node = node;
        this.dist = dist;
    }
}
class Solution {
    static TreeNode start;
    static HashMap<TreeNode,TreeNode> parent;
    public int amountOfTime(TreeNode root, int target) {
        start = null;
        parent = new HashMap<>();
        dfs(root,target);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start,0));
        HashSet<TreeNode> infected = new HashSet<>();
        infected.add(start);
        int time = 0;
        while(q.size()>0){
            Pair front = q.remove();
            int dist = front.dist;
            time = Math.max(time,dist);
            TreeNode node = front.node;
            if(node.left != null && !infected.contains(node.left)){
                q.add(new Pair(node.left,dist+1));
                infected.add(node.left);
            }
              if(node.right != null && !infected.contains(node.right)){
                q.add(new Pair(node.right,dist+1));
                infected.add(node.right);
            }
              if(parent.containsKey(node) && !infected.contains(parent.get(node))){
                q.add(new Pair(parent.get(node),dist+1));
                infected.add(parent.get(node));
            }
        }
        return time;
    }

    private void dfs(TreeNode root, int target) {
        if(root == null ) return;
        if(root.val == target) start = root;
        if(root.left != null) parent.put(root.left,root);
        if(root.right != null) parent.put(root.right,root);
        dfs(root.left,target);
        dfs(root.right,target);
    }
}