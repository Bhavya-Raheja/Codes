import java.util.*;
 
 
class Treeop{
    class node{
	int key;
	node left;
	node right;
	node(int k){
	    key=k;
	}
    }
	node root;
	void insert(int key){
	    root=put(root,key);
	}
	node put(node root,int key){
	    if(root==null)
		return new node(key);
		if(key>=root.key)
		    root.right=put(root.right,key);
		else
		    root.left=put(root.left,key);
		return root;
	}
	void remove(int key){
	    root=delete(root,key);
	}
 
	node delete(node root,int key){
	    if(root==null)
		return null;
		if(root.key<key)
		    root.right=delete(root.right,key);
		else if(root.key>key)
		    root.left=delete(root.left,key);
		else{
		    if(root.left==null&&root.right==null)
			return null;
 
			else if(root.right!=null){
			    root.key=root.right.key;
			    root.right=delete(root.right,root.key);
			}
 
			else{
			    root.key=root.left.key;
			    root.left=delete(root.left,root.key);
			}
 
		}
		return root;
	}
 
	void inorder(){
	    in_order(root);
	    System.out.println("\n");
	}
	void in_order(node root){
	    if(root==null)
		return;
	    in_order(root.left);
	    System.out.print(root.key+" ");
	    in_order(root.right);
	}
	void preorder(){
	    pre_order(root);
	}
	void pre_order(node root){
	    if(root==null)
		return;
		System.out.print(root.key+" ");
		pre_order(root.left);
		pre_order(root.right);
	}
 
}
public class Tree{
    public static void main (String[] args)
        {
	    int[] arr={2,4,7,2,3,4,5,9,6};
	    int i=0;
	    Treeop b=new Treeop();
            for(i=0;i<9;i++){
		    b.insert(arr[i]);
		}
                b.inorder();
		b.remove(3);
		b.inorder();
	}
}
 