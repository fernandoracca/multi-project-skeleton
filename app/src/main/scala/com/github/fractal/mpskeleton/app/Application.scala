package com.github.fractal.mpskeleton.app

import com.github.fractal.mpskeleton.common.KafkaConfig
import com.github.fractal.mpskeleton.kafka.DummyKafkaConsumer

object Application extends App {

  val kafkaConsumer = DummyKafkaConsumer(SimpleKafkaConfig())

  kafkaConsumer.consume()

}


case class SimpleKafkaConfig(topic : String = "dummyTopic") extends KafkaConfig