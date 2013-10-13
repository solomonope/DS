package org.solomon.ds;

public class Bst {
	
	public BstNode Root;
	
	public void Add(int Value){
		
		if(Root == null){
			
			Root = new BstNode();
			Root.Value = Value;
		}else{
			
			AddNode(Root, Value);
		}
	}
	
	private void  AddNode(BstNode node,int Value){
		
		if(node.Value > Value){
			
			if(node.Left == null){
				
				node.Left =  new BstNode();
				node.Left.Value = Value;
			}else{
				
				AddNode(node.Left,Value);
			}
			
		}else{
			
		}
	}

}
