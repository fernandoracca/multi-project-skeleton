package com.github.fractal.mpskeleton.kafka

import com.github.fractal.mpskeleton.common.KafkaConfig

case class DummyKafkaConsumer(kafkaConfig: KafkaConfig) {

  import KafkaConsumer.logger

  def consume(): Unit = {
    val topic = kafkaConfig.topic

    logger.info(s"[Consumer] @ $topic ")
  }

}
