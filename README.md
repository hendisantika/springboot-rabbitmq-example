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

``` 