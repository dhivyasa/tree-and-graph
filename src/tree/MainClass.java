package tree;
public class MainClass {
	
	public static void main(String[] args){
		SubTree subtree_15 = new SubTree(15,new SubTree(5),new SubTree(18));
		SubTree subtree_40 = new SubTree(40,new SubTree(37),new SubTree(43));
		SubTree bintree_32 = new SubTree(32,subtree_15,subtree_40);
		searchValue(bintree_32,8);
	}
	
	public static boolean searchValue(SubTree subtree,int value){
		/**
		 * In an ordered Binary Tree, search for a value by 
		 * comparing value at current node and recursing with
		 * the left or right subtree. 
		 */
		if (subtree.value == value){
			System.out.println(value);
			return true;
		}
		if (value < subtree.value ) {
			if (subtree.leftSubTree != null){
				searchValue(subtree.leftSubTree,value);}
		}
		if (value > subtree.value ){
			if (subtree.rightSubTree != null){
				searchValue(subtree.rightSubTree,value);
			}
		}
		return false;
		
	}
	
	
	
	

}
