package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Question__把二叉树打印为多行 {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		if(pRoot == null)
			return list;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(pRoot);
		while(!queue.isEmpty()) {
			int length = queue.size();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int i = 0; i < length; ++i) {
				arr.add(queue.peek().val);
				TreeNode node = queue.poll();
				if(node.left != null)
					queue.add(node.left);
				if(node.right != null)
					queue.add(node.right);
				
			}
			list.add(arr);
		}
    	return list; 
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
