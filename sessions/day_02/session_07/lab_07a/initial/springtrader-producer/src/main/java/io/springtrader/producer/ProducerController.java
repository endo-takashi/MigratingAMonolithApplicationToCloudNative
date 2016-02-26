package io.springtrader.producer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class ProducerController {

//    private Log log = LogFactory.getLog(ProducerController.class);
//    private AtomicInteger counter = new AtomicInteger(0);
//
//    @RequestMapping(value = "/", produces = "application/json")
//    public String produce() {
//        int value = counter.getAndIncrement();
//        log.info("Produced a value: " + value);
//
//        return String.format("{\"value\":%d}", value);
//    }

    @Value("${latency:0}")
    int latency;

    private Log log = LogFactory.getLog(ProducerController.class);
    private AtomicInteger counter = new AtomicInteger(0);

    @RequestMapping(value = "/", produces = "application/json")
    public String produce() {
        if (latency > 0) {
            try {
                Thread.sleep(latency);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int value = counter.getAndIncrement();
        log.info("Produced a value: " + value);

        return String.format("{\"value\":%d}", value);
    }

}
