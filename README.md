# SleuthAndKafkaPoc
Poc on how Sleuth and Kafka integrate together

- app1 module is the application containing the producer of the messages
- app2 module is the application containing the consumer of the messages


How to run:

1) Download latest kafka https://kafka.apache.org/downloads
2) Start the zookeper with the command below:
   ./bin/zookeeper-server-start.sh config/zookeeper.properties
3) Start the kafka server:
   ./bin/kafka-server-start.sh config/server.properties
4) Create a topic:
  bin/kafka-topics.sh --describe --topic api.requests --bootstrap-server localhost:9092
5) After you run both app1 and app2. Go to a web browser and enter localhost:8080/get/{id}
