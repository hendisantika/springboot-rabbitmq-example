# springboot-rabbitmq-example
How to use RabbitMQ with Publisher and Consumer Example

Install RabbitMQ in windows :
-----------------------------
1. Download and install ERlang http://erlang.org/download/otp_win64_22.3.exe
2. Download and install RabbitMQ https://github.com/rabbitmq/rabbitmq-server/releases/download/v3.8.8/rabbitmq-server-3.8.8.exe
3. Go to RabbitMQ Server install Directory C:\Program Files\RabbitMQ Server\rabbitmq_server-3.8.3\sbin
4. Run command rabbitmq-plugins enable rabbitmq_management
5. Open browser and enter http://localhost:15672/ to redirect to RabbitMQ Dashboard
6. Also we can Open it with IP Address http://127.0.0.1:15672
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
 :: Spring Boot ::        (v2.3.4.RELEASE)

2020-09-30 06:12:57.643  INFO 81221 --- [           main] h.s.SpringbootRabbitmqExampleApplication : Starting SpringbootRabbitmqExampleApplication on Hendis-MacBook-Pro.local with PID 81221 (/Users/hendisantika/IdeaProjects/springboot-rabbitmq-example/target/classes started by hendisantika in /Users/hendisantika/IdeaProjects/springboot-rabbitmq-example)
2020-09-30 06:12:57.653  INFO 81221 --- [           main] h.s.SpringbootRabbitmqExampleApplication : No active profile set, falling back to default profiles: default
2020-09-30 06:12:59.750  INFO 81221 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2020-09-30 06:12:59.769  INFO 81221 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-09-30 06:12:59.769  INFO 81221 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.38]
2020-09-30 06:12:59.915  INFO 81221 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-09-30 06:12:59.915  INFO 81221 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2120 ms
2020-09-30 06:13:01.091  INFO 81221 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-09-30 06:13:01.631  INFO 81221 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2020-09-30 06:13:01.635  INFO 81221 --- [           main] o.s.a.r.c.CachingConnectionFactory       : Attempting to connect to: [localhost:5672]
2020-09-30 06:13:01.716  INFO 81221 --- [           main] o.s.a.r.c.CachingConnectionFactory       : Created new connection: rabbitConnectionFactory#a8d1053:0/SimpleConnection@93e25a20 [delegate=amqp://guest@127.0.0.1:5672/, localPort= 53183]
2020-09-30 06:13:01.913  INFO 81221 --- [           main] h.s.SpringbootRabbitmqExampleApplication : Started SpringbootRabbitmqExampleApplication in 4.928 seconds (JVM running for 11.454)
2020-09-30 06:14:21.636  INFO 81221 --- [nio-8080-exec-2] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2020-09-30 06:14:21.636  INFO 81221 --- [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2020-09-30 06:14:21.661  INFO 81221 --- [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 24 ms
2020-09-30 06:14:22.207  INFO 81221 --- [ntContainer#0-1] c.h.s.consumer.User                      : Message recieved from queue : OrderStatus(order=Order(orderId=1c2e8c19-0ca9-42f6-9364-18c1d0bb3109, name=Uzumaki Naruto, qty=1, price=2500.0), status=PROCESS, message=order placed succesfully in dramagasunda)
2020-09-30 06:19:31.071  INFO 81221 --- [ntContainer#0-1] c.h.s.consumer.User                      : Message recieved from queue : OrderStatus(order=Order(orderId=a2405aa1-694a-484e-b8e7-5cc3720a651c, name=Uzumaki Naruto, qty=12, price=12500.0), status=PROCESS, message=order placed succesfully in dramagasunda2)
2020-09-30 06:20:18.492  INFO 81221 --- [ntContainer#0-1] c.h.s.consumer.User                      : Message recieved from queue : OrderStatus(order=Order(orderId=e82ea089-5aed-4125-bfaa-1d11f287f56c, name=Uzumaki Naruto, qty=12, price=12500.0), status=PROCESS, message=order placed succesfully in dramagasunda)

``` 