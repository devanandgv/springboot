# Spring Boot Profiles

Spring Profiles provide a way to segregate parts of your application configuration and make it be available only in certain environments

#### Adding Active profiles  

##### 1. Application Properties  #####
 &nbsp;&nbsp;&nbsp;&nbsp;spring.profiles.active=dev,uat  	
##### 2. Command Line Arguments #####	
&nbsp;&nbsp;&nbsp;&nbsp;--spring.profiles.active=dev,uat  
##### 3. JVM System Parameter #####		
&nbsp;&nbsp;&nbsp;&nbsp;-Dspring.profiles.active=dev
##### 4. Web.xml ##### 
				<context-param>
    				<param-name>spring.profiles.active</param-name>
    				<param-value>dev</param-value>
				</context-param>         
##### 5. WebApplicationInitializer #####
   				
				@Configuration
				public class MyWebApplicationInitializer implements WebApplicationInitializer {
	   			@Override
	   			public void onStartup(ServletContext servletContext) throws ServletException {
	        			servletContext.setInitParameter("spring.profiles.active", "dev");
	    			}
				}                                          
				