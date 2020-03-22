<pre><span style=' color: Blue;'>package</span> com.javasportal; 

<span style=' color: Blue;'>import</span> org.springframework.context.annotation.AnnotationConfigApplicationContext;
<span style=' color: Blue;'>import</span> org.springframework.context.support.AbstractApplicationContext;

<span style=' color: Blue;'>public</span> <span style=' color: Blue;'>class</span> Test { 

    <span style=' color: Blue;'>public</span> <span style=' color: Blue;'>static</span> <span style=' color: Blue;'>void</span> main(String[] args) {

        AbstractApplicationContext  context = <span style=' color: Blue;'>new</span> AnnotationConfigApplicationContext(
                AppContext.<span style=' color: Blue;'>class</span>); 

        Employee employee = (Employee) context.getBean(<span style=' color: Maroon;'>"employee"</span>); 
        employee.setName(<span style=' color: Maroon;'>"Rahul Sharma (C.A)"</span>); 
        employee.displayInfo(); 
        context.registerShutdownHook(); 
    } 

} 
</pre>