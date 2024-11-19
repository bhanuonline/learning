what is spring cloud?
spring cloud is a collection of tools that help you quickly build and deploy cloud-native applications. 
It is a framework that provides a variety of services to help you build applications that are resilient, scalable, and fault-tolerant. 
Spring Cloud is built on top of the Spring Framework, which is a popular Java framework for building enterprise applications.
Spring Cloud is a collection of tools within the Spring ecosystem designed to help developers quickly build and deploy microservices-based applications

Spring Cloud Stream: A framework for building highly scalable event-driven microservices connected with shared messaging systems.
    event streaming: a way of processing and distributing data in real-time
    Creating or genrating events and sending them to a messaging system where they can be consumed by other services or applications in real-time. 
    processing of real-time data streams from various sources and sending them to a messaging system where they can be consumed by other services or applications in real-time.
┌───────────────────────────────────────────┐
│                   Kafka                   │
│                                           │
│  ┌───────────┐   ┌───────────┐   ┌─────┐ │
│  │ Producer  │   │ Producer  │   │ ... │ │
│  └─────┬─────┘   └─────┬─────┘   └─────┘ │
│        │               │                │
│    ┌───▼───────────────▼───────┐        │
│    │          Topics           │        │
│    │                           │        │
│    │  ┌───────┐  ┌───────┐     │        │
│    │  │ Topic │  │ Topic │     │        │
│    │  └───┬───┘  └───┬───┘     │        │
│    │      │          │         │        │
│    │  ┌───▼──────────▼───┐     │        │
│    │  │  Partition 1     │     │        │
│    │  └──────────────────┘     │        │
│    │             ...            │        │
│    │  ┌──────────────────┐      │        │
│    │  │  Partition N     │      │        │
│    │  └──────────────────┘      │        │
│    └───────────────────────────┘        │
│                                           │
│  ┌───────────┐   ┌───────────┐   ┌─────┐ │
│  │ Consumer  │   │ Consumer  │   │ ... │ │
│  └─────┬─────┘   └─────┬─────┘   └─────┘ │
│        │               │                │
│                                           │
└───────────────────────────────────────────┘
Producer ──> [ Topic ] ──> Consumer
Producer: Writes messages into a topic.
Topic: Stores messages.
Consumer: Reads messages from the topic

Producers: Write messages into Kafka topics.
Topics: Folders where messages are stored. Each topic can have multiple partitions (represented by "Partition 1" to "Partition N").
Partitions: Sections within topics where messages are stored. They help distribute and parallelize message storage and processing.
Consumers: Read messages from Kafka topics.They read messages in the order they were produced, ensuring that data is processed sequentially if required

kafka component :
    producer: writes messages to a topic
    topic: a folder where messages are stored
    partition: a section within a topic where messages are stored
    consumer: reads messages from a topic
    broker: a server that manages topics and partitions
    zookeeper: a service that manages brokers and topics
    offset: a unique identifier for each message in a partition
    group: a collection of consumers that work together to read messages from a topic
    replication: the process of copying data across multiple brokers for fault tolerance
    leader: the broker that is responsible for handling read and write requests for a partition
    follower: a broker that replicates data from the leader for fault tolerance
    controller: a broker that manages the state of the Kafka cluster
    cluster: a group of brokers that work together to store and process messages
    broker: a server that manages topics and partitions
    round-robin: a load balancing strategy that evenly distributes messages across partitions
    connection: a link between a producer or consumer and a broker
    connector: a tool that moves data between Kafka and other systems
    Streams Processing : a library that allows you to process data in real-time
    kafka utilities: a set of tools that help you manage and monitor Kafka clusters
    kafka offset exporter: a tool that exports Kafka consumer offsets to Prometheus

Check Processes
    ps aux | grep kafka
    ps aux | grep zookeeper
    ps aux | grep java
    ps aux | grep kafka
    ps aux | grep zookeeper
    netstat -tuln | grep 9092  # For Kafka (default port)
    netstat -tuln | grep 2181  # For ZooKeeper (default port)

Useful command :
*     bin/kafka-topics.sh --bootstrap-server localhost:9092 --create --topic kafka_learning_topic --partitions 3 --replication-factor 1
*     bin/kafka-topics.sh --bootstrap-server localhost:9092 --list
*     bin/kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic kafka_learning_topic
*     bin/kafka-console-producer.sh --broker-list localhost:9092 --topic kafka_learning_topic
*     bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic kafka_learning_topic --from-beginning
*     bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic kafka_learning_topic --from-beginning --group my-group
*     bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic kafka_learning_topic --from-beginning --group my-group --property print.key=true --property key.separator=,




