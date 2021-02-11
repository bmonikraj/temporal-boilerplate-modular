package org.example;

import org.example.worker.MoneyTransferWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerBean implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CommandLineRunnerBean.class);

    @Autowired
    MoneyTransferWorker moneyTransferWorker;

    @Override
    public void run(String... args) throws Exception {
        logger.info("CommandLineRunner launching temporal worker thread");
        moneyTransferWorker.run();
    }
}
