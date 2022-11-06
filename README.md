# spring-boot-kafka-prod-con-app

This is a Simple Kafka Producer-Consumer Application built in Spring Boot.

Instructions:

1. Clone Repo
2. docker-compose up (spins up the kafka image)
3. Run (CommandLineRunner used to insert some data into the topic on boot up)
4. POST http://localhost:8080/api/v1/messages to insert data into the topic.

P.S: Use application.properties to alter topic name. The one used here is 'tanapp'.
