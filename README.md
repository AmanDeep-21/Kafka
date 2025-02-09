# Kafka

## Software pre-requisite
We need to install Zookeeper and Kafka in local.

## To check if kafka is already installed on macOS
> brew list | grep kafka

It should print **kafka**

## To install kafka on macOS
> brew install kafka

It'll install both kafka and zookeeper 

## Now, We need a
- Spring boot project
- Kafka in dependency along with with Web
- Controller to send messages from postman along with topic name
- Producer who push the messages / events to the topic passed in payload
- Consumer to listen to the topic
- application.yml to configure producer settings
- startup zookeeper and kafka
- hit the REST endpoint using cURL or postman

## To check zookeeper is running on macOS
> ps aux | grep zookeeper

## To check kafka is running on macOS
> ps aux | grep kafka

## To check all the list of services running by brew and check the status of it, it should be "started" if its running already
> brew services list

## If Zookeeper is NOT Running
> zookeeper-server-start /opt/homebrew/etc/kafka/zookeeper.properties

OR 

> brew services start zookeeper

## Once Zookeeper is running, open a new terminal and start Kafka
> kafka-server-start /opt/homebrew/etc/kafka/server.properties

OR

> brew services start kafka


## cURL to hit the request

`curl --location --request POST 'http://localhost:9095/api/v1/producerMsg?message=Aman&topic=test-topic'`
