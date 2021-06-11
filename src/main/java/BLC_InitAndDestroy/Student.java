package BLC_InitAndDestroy;

public class Student {
	 public void init() throws Exception
	    {
	        System.out.println(
	            "Bean HelloWorld has been "
	            + "instantiated and I'm "
	            + "the init() method");
	    }
	  
	    // This method executes
	    // when the spring container
	    // is closed
	    public void destroy() throws Exception
	    {
	        System.out.println(
	            "Conatiner has been closed "
	            + "and I'm the destroy() method");
	    }
}
