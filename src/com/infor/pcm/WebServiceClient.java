/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.infor.pcm;


import java.net.MalformedURLException;
import java.util.UUID;

/**
 *
 * @author pdownton
 */
public class WebServiceClient 
{
  private  ProductConfiguratorServiceProxy proxy;

    public static void main(String[] args) throws MalformedURLException 
    {
        
        WebServiceClient client = new WebServiceClient();
   
       
        InputParameters inputParameters = getInputParameters();
        
 
        ConfigurationSummary configurationSummary = client.runInteractive(inputParameters); 
        System.out.println(configurationSummary.getResult().value()); 
        System.out.println(configurationSummary.getMessage());
        

      configurationSummary = client.runPostProcess(inputParameters); 
      System.out.println(configurationSummary.getResult().value()); 
      System.out.println(configurationSummary.getMessage()); 
      
      
      //Example of executing an extension
      String result = client.executeExtension(inputParameters.getApplication());

        //The output is an XML string containing the results 
        System.out.println(result);
        
    }
    
    
    
    public static InputParameters getInputParameters()
    
    {
        InputParameters inputParameters = new InputParameters();
        
        Application application = new Application();
        
        //Instance file name 
        application.setInstance("byo_satyr");
        
        //Application name 
        application.setName("byo_satyr"); inputParameters.setApplication(application);
        
        //Configuration identification
        HeaderDetail headerDetail = new HeaderDetail(); 
        headerDetail.setHeaderId("Web Service Call"); 
        headerDetail.setDetailId(UUID.randomUUID().toString()); 
        inputParameters.setHeaderDetail(headerDetail);
        
        
        //Integration parameters
        ArrayOfIntegrationParameter integrationParameters = new ArrayOfIntegrationParameter();
        inputParameters.setIntegrationParameters(integrationParameters);
        
        IntegrationParameter integrationParameter = new IntegrationParameter();

        //Required to exist else an exception is thrown (but value not required)
        integrationParameter.setName("CurrencyCode"); integrationParameters.getIntegrationParameter().add(integrationParameter);
        
        inputParameters.setMode(ConfigurationMode.INTERACTIVE_RULESET);
        
        
    Part part = new Part(); 
    part.setNamespace("Default");
    part.setName("V278"); 
    inputParameters.setPart(part);
    

    inputParameters.setProfile("Default");
    return inputParameters;
        
    }
    
    public WebServiceClient() throws MalformedURLException
    {  
       
       ProductConfiguratorService service = new ProductConfiguratorService(); 
       
       // problem setting up the proxy
       ProductConfiguratorServiceProxy proxy = service.getBasicHttpBindingProductConfiguratorServiceProxy();

    }
    
    public ConfigurationSummary runInteractive(InputParameters inputParameters)
            
   {

    //Set to interactive mode input
       inputParameters.setMode(ConfigurationMode.INTERACTIVE_RULESET); 
       return proxy.configure(inputParameters);
   }         
            
    /**
     *
     * @param inputParameters
     * @return
     */
    public ConfigurationSummary runPostProcess(InputParameters inputParameters)
     {
        //Set to post process mode 
         inputParameters.setMode(ConfigurationMode.POST_CONFIGURATION_RULESET);

        //Set the source header to be the same as the target so it will pick up the existing configuration 
        inputParameters.setSourceHeaderDetail(inputParameters.getHeaderDetail());
        return proxy.configure(inputParameters);
     }       
    
     public String executeExtension(Application application){
         ArrayOfstring array = new ArrayOfstring(); 
         array.getString().add("string1"); 
         array.getString().add(" - "); 
         array.getString().add("string2");
         return proxy.executeExtension(application, "ConcatStrings", array);
     }



     
}