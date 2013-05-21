package tree;

public class SubTree {
	int value;
	SubTree leftSubTree;
	SubTree rightSubTree;
	
	SubTree(int value){
		this.value = value;
		this.leftSubTree = null ;
		this.rightSubTree = null ;
	}
	
	SubTree(int value, SubTree leftSubTree, SubTree rightSubTree){
		this.value = value;
		this.leftSubTree = leftSubTree ;
		this.rightSubTree = rightSubTree ;
	}
	
	public String toString(){
		return ""+this.value ;
	}
	
}
