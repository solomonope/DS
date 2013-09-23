

public class ArrayList {
	
	private int m_Length  = 0;
	private int m_Size = 0;
	private Object [] m_Data;
	public ArrayList(){
		this.m_Size = 16;
		this.m_Data =  new Object[16];
		this.m_Length = 0;
	}
	
	public boolean  Add(Object data){
		
		if(this.m_Length == this.m_Size){
			
			this.grow();
		}
		 this.m_Data[this.m_Length++] = data;
		return true;
		
	}
	public Object Get(int i){
		
		if(i> this.m_Length)
			return null;
		
		return this.m_Data[i];
	}
	private void grow(){
		this.m_Size = 2 * this.m_Size;
		
		Object [] temp = this.m_Data;
		this.m_Data  = new Object[this.m_Size];
		
		for(int i=0 ; i<=this.m_Length-1; i++){
			 
			this.m_Data[i] = temp[i];
			
		}
		
		
	}

}
