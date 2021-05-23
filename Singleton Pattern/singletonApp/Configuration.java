package singletonApp;

public class Configuration {
    	private static volatile Configuration configuration;
	private static String configFile;

	private Configuration()
	{
		if(configuration != null)
			throw new RuntimeException("How was this constructor created");
	}

	public static Configuration getConfiguration()
	{
		if(configuration == null)
		{
			synchronized(Configuration.class)
                        {
			    try{
			    	Thread.sleep(5000); // Emulate A process
			    }catch(InterruptedException ex){
				System.out.println("Was Interupted");
			    }
                            if(configuration == null)
                                configuration = new Configuration();
                        }
		}
			
		return configuration;		
	}

	public String getConfigFile()
	{
	        if (configFile == null)
                {
                    synchronized(Configuration.class)
                        {
                            if(configFile == null)
                               configFile = "config.file";
                        }
                }
                       
		return configFile;		
	}

}
