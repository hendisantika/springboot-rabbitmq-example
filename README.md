# springboot-rabbitmq-example
How to use RabbitMQ with Publisher and Consumer Example

Install RabbitMQ in windows :
-----------------------------
1. Download and install ERlang http://erlang.org/download/otp_win64_22.3.exe
2. Download and install RabbitMQ https://github.com/rabbitmq/rabbitmq-server/releases/download/v3.8.8/rabbitmq-server-3.8.8.exe
3. Go to RabbitMQ Server install Directory C:\Program Files\RabbitMQ Server\rabbitmq_server-3.8.3\sbin
4. Run command rabbitmq-plugins enable rabbitmq_management
5. Open browser and enter http://localhost:15672/ to redirect to RabbitMQ Dashboard
6. Also, we can Open it with IP Address http://127.0.0.1:15672
7. Login page default username and password is guest
8. After successfully login you should see RabbitMQ Home page

### Things todo List
1. Clone this repository: `git clone https://github.com/hendisantika/springboot-rabbitmq-example.git`
2. Go to the folder: `cd springboot-rabbitmq-example`
3. Run the application: `mvn clean spring-boot:run`
4. Open new terminal & run rabbit-mq docker container: `docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management`
5. Open RabbitMQ Management Web Console: localhost:15672
6. Send request:
```
POST http://localhost:8080/order/dramagasunda

{
    "name": "Uzumaki Naruto",
    "qty": 12,
    "price": 12500
}

   .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.2)

2022-08-04 14:34:29.580  INFO 64660 --- [           main] h.s.SpringbootRabbitmqExampleApplication : Starting SpringbootRabbitmqExampleApplication using Java 18.0.2 on Powercommerceasias-MacBook-Pro.local with PID 64660 (/Users/powercommerce/IdeaProjects/springboot-rabbitmq-example/target/classes started by powercommerce in /Users/powercommerce/IdeaProjects/springboot-rabbitmq-example)
2022-08-04 14:34:29.581  INFO 64660 --- [           main] h.s.SpringbootRabbitmqExampleApplication : No active profile set, falling back to 1 default profile: "default"
2022-08-04 14:34:29.951  INFO 64660 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-08-04 14:34:29.955  INFO 64660 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-08-04 14:34:29.955  INFO 64660 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.65]
2022-08-04 14:34:29.995  INFO 64660 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-08-04 14:34:29.995  INFO 64660 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 396 ms
2022-08-04 14:34:30.303  INFO 64660 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-08-04 14:34:30.304  INFO 64660 --- [           main] o.s.a.r.c.CachingConnectionFactory       : Attempting to connect to: [woodpecker.rmq.cloudamqp.com:5672]
2022-08-04 14:34:31.587  INFO 64660 --- [           main] o.s.a.r.c.CachingConnectionFactory       : Created new connection: rabbitConnectionFactory#656922a0:0/SimpleConnection@800d065 [delegate=amqp://kdflkehp@100.24.62.161:5672/kdflkehp, localPort= 53271]
2022-08-04 14:34:34.431  INFO 64660 --- [           main] h.s.SpringbootRabbitmqExampleApplication : Started SpringbootRabbitmqExampleApplication in 4.99 seconds (JVM running for 5.434)
2022-08-04 14:34:38.300  INFO 64660 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2022-08-04 14:34:38.300  INFO 64660 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2022-08-04 14:34:38.300  INFO 64660 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 0 ms
2022-08-04 14:34:38.915  INFO 64660 --- [ntContainer#0-1] c.h.s.consumer.User                      : Message received from queue : OrderStatus(order=Order(orderId=35f20814-29a0-4066-a409-9b416ec2ce1d, name=Uzumaki Naruto, qty=12, price=12500.0), status=PROCESS, message=order placed successfully in Cibiuk)
2022-08-04 14:35:42.946  INFO 64660 --- [ntContainer#0-1] c.h.s.consumer.User                      : Message received from queue : OrderStatus(order=null, status=null, message=null)
2022-08-04 14:36:41.943  INFO 64660 --- [ntContainer#0-1] c.h.s.consumer.User                      : Message received from queue : OrderStatus(order=Order(orderId=a4aab73c-9f37-4f48-95f7-96912ecda4b9, name=Uzumaki Naruto, qty=12, price=12500.0), status=PROCESS, message=order placed successfully in Cibiuk)
``` 