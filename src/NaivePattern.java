
public class NaivePattern {
	
	String m_Pattern = null;
	String m_Text =  null;
	int  m_M = 0;
	int m_N = 0;
	int m_Diff = 0;
    ArrayList m_Patterns;
	public NaivePattern(String Pattern,String Text){
		
		this.m_Pattern =  Pattern;
		 this.m_Text  =  Text;
		 
		 this.m_M = this.m_Pattern.length();
		 
		 this.m_N =  this.m_Text.length();
		 
		 this.m_Diff = this.m_N - this.m_M;
		 m_Patterns = new ArrayList();
	}

	
	public ArrayList Find(){
		
		for(int i = 0; i< this.m_Diff; i++){
			
			int j = 0;
			
			for(j=0; j<this.m_M; j++)
			{
				if( this.m_Text.charAt(i+j) != this.m_Pattern.charAt(j)   )
					break;
			}
			
			if(j== this.m_M)
				this.m_Patterns.Add(i);
			
			
		}
		
		return this.m_Patterns;
	}
}
