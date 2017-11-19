package com.github.fractal.mpskeleton.kafka

import com.github.fractal.mpskeleton.common.KafkaConfig
import org.slf4j.LoggerFactory


trait SimpleKafkaConsumer {
  def kafkaConfig: KafkaConfig
}


object KafkaConsumer {

  val logger = LoggerFactory.getLogger(KafkaConsumer.getClass)
}