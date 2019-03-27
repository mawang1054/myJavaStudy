package swardToOffer;

public class Question6 {

	public static void main(String[] args) {
		int[] pre = {1,2,3,4,5,6,7};
		int[] in = {3,2,4,1,6,5,7};
		Solution.reConstructBinaryTree(pre, in);
	}

}

class TreeNode {
     int val;
     TreeNode left;
    TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Solution {
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null || pre.length != in.length || in.length <= 0)
            return null;
        return constructCore(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }
    
    public static TreeNode constructCore(int[] pre,int ps,int pe,int[] in,int is,int ie){
        if (ps > pe)
            return null;
        int rootValue = pre[ps];
        int rootIndex = is;
        while (rootIndex <= ie && in[rootIndex] != rootValue){
            ++rootIndex;
        }
        if(rootIndex > ie){
            throw new RuntimeException("invalid input");
        }
        TreeNode rootNode = new TreeNode(rootValue);
        rootNode.left = constructCore(pre, ps + 1, ps + rootValue - is, in, is, rootIndex - 1);
        rootNode.right = constructCore(pre, ps + rootValue - is + 1, pe, in, rootIndex + 1, ie);
        return rootNode;
    }
}