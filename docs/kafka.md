What is Spring Cloud Stream? : postal service for your application where messages (data) are sent and received between different parts of your system
Configuration:
- spring.cloud.stream.bindings
- spring.cloud.stream.default.contentType
- spring.cloud.stream.default.consumer
- spring.cloud.stream.default.producer
- spring.cloud.stream.kafka.binder.brokers
- spring.cloud.stream.kafka.binder.zkNodes
- spring.cloud.stream.kafka.binder.defaultBrokerPort
- spring.cloud.stream.kafka.binder.defaultZkPort
Bindings:These are like the addresses for sending and receiving messages
- spring.cloud.stream.bindings.<channelName>.destination
- spring.cloud.stream.bindings.<channelName>.group
- spring.cloud.stream.bindings.<channelName>.contentType
- spring.cloud.stream.bindings.<channelName>.consumer
- spring.cloud.stream.bindings.<channelName>.producer
- spring.cloud.stream.bindings.<channelName>.partitionKeyExpression
- spring.cloud.stream.bindings.<channelName>.partitionCount
- spring.cloud.stream.bindings.<channelName>.requiredGroups
- spring.cloud.stream.bindings.<channelName>.producer.partitionKeyExpression
- spring.cloud.stream.bindings.<channelName>.producer.partitionCount
- spring.cloud.stream.bindings.<channelName>.producer.partitionKeyExtractorClass
- spring.cloud.stream.bindings.<channelName>.producer.partitionSelectorClass
  
Channels: Think of channels as mailboxes. There are two types:
    Input Channel: Where your application receives messages.
    Output Channel: Where your application sends messages.
