package BLC_InitAndDestroy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		 // Loading the Spring XML configuration
        // file into the spring container and
        // it will create the instance of
        // the bean as it loads into container
  
        ConfigurableApplicationContext cap
            = new ClassPathXmlApplicationContext(
                "bean.xml");
  
        // It will close the spring container
        // and as a result invokes the
        // destroy() method
        cap.close();

	}

}
