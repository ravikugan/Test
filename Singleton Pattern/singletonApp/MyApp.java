
package singletonApp;


public class MyApp extends Thread {
    
  	public static void main(String args[])
	{
		MyApp t1 = new MyApp();
		runConfig();
		t1.start();

	}

	public void run()
	{
		runConfig();
	}

	public static void runConfig()
	{
		long start;
                long end;
            
                start = System.currentTimeMillis();
		Configuration config1 = Configuration.getConfiguration();	
                String myfile = config1.getConfigFile();
		end = System.currentTimeMillis();
		

		System.out.println(currentThread().getName()+" "+myfile+" Time taken:"+(end-start));

	}
    
}
