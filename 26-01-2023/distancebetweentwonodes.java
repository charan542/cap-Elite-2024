import java.util.* ;
import java.io.*; 
/*************************************************************

	Following is the TreeNode class structure

	class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val)
		{
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

 *************************************************************/

public class Solution
{
	 static boolean isfind(TreeNode root,int node){
		if(root==null){
			return false;

		}
		boolean l=isfind(root.left,node);
		boolean r=isfind(root.right,node);
		if(root.val==node){
			return true;
		}
		if(l||r){
			return true;
		}

		
		return false;
	}
	static TreeNode lca(TreeNode root,int node1,int node2){
		if(root==null){
			return null;
		}
		if(root.val==node1||root.val==node2){
			return root;
		}
		TreeNode l=lca(root.left,node1,node2);
		TreeNode r=lca(root.right,node1,node2);
	if(l!=null&&r!=null){
		return root;
	}
	if(l!=null){
		return l;
	}
	if(r!=null){
		return r;
	}
	return null;

	}
	static int s=0;
	static int pathsum(TreeNode root,int node){
		if(root==null){
			return 0;
		}
		if(root.val==node){
			s=s+1;
			return s;
		}
		int l=pathsum(root.left,node);
		int r=pathsum(root.right,node);
		if(l!=0||r!=0){
			
			s=s+1;
			return s;
		}
		return 0;
	}
	public static int findDistanceBetweenNodes(TreeNode root, int node1, int node2)
	{	if(root==null){
			return -1;

		}
		if(!(isfind(root,node1)&&isfind(root,node2))){
			 return -1;
		}
		TreeNode t=lca(root,node1,node2);
		int pl=pathsum(t,node1);
		s=0;
		int pr=pathsum(t,node2);
		s=0;
		if(t.val==node1){
			int pc=pathsum(t,node2);
			s=0;
			return pc-1;
		}
		if(t.val==node2){
			int pc=pathsum(t,node1);
			s=0;
			return pc-1;
		}
		int pc=pathsum(root,t.val);
		s=0;
		
		return pl+pr-pc-1;

	}
}
