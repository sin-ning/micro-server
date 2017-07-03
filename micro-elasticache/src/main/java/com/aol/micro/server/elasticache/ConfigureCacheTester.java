package com.aol.micro.server.elasticache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by gordonmorrow on 03/07/2017.
 */
@Configuration
public class ConfigureCacheTester {

    @Autowired
    private ElasticacheConnectionTester elasticacheConnectionTester;


    @Scheduled(fixedDelay = 60000)
    public synchronized void runElasticacheConnectionTester(){
        elasticacheConnectionTester.scheduleAndLog();
    }
}
