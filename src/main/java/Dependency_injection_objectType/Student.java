package Dependency_injection_objectType;

public class Student {
 private int id;
 
	public void setId(int id) {
	this.id = id;
}

	private	MathCheat mathcheat ;
	
	public void setCheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}

	public void cheating() 
	{
		mathcheat.mathCheat();
	}
	
}
