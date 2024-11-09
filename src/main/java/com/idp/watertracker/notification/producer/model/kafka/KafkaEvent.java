package com.idp.watertracker.notification.producer.model.kafka;

import lombok.Data;

@Data
public class KafkaEvent<T> {

    private EventMetadata meta;

    private T data;


}
