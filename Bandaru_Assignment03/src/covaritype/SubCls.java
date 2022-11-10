package covaritype;

public class SubCls extends SuperCls {
	
	@Override  
	SubCls get(){
		
		return this;
		}    
	void message(){
		System.out.println("Covariant return type");
		}   

}

