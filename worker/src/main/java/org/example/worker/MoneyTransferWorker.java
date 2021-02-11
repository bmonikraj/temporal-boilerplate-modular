package org.example.worker;

import io.temporal.client.WorkflowClient;
import io.temporal.serviceclient.WorkflowServiceStubs;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;
import org.example.implementations.AccountActivityImpl;
import org.example.implementations.MoneyTransferWorkflowImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class MoneyTransferWorker {
    private static final Logger logger = LoggerFactory.getLogger(MoneyTransferWorker.class);

    @Value("${workflow.queue.money.transfer}")
    private String workflowQueueMoneyTransfer;

    public void run() {
        logger.info("Starting MoneyTransferWorker as separate thread, name : {}", Thread.currentThread().getName());
        WorkflowServiceStubs serviceStubs = WorkflowServiceStubs.newInstance();
        WorkflowClient workflowClient = WorkflowClient.newInstance(serviceStubs);
        WorkerFactory factory = WorkerFactory.newInstance(workflowClient);
        Worker worker = factory.newWorker(workflowQueueMoneyTransfer);
        worker.registerWorkflowImplementationTypes(MoneyTransferWorkflowImpl.class);
        worker.registerActivitiesImplementations(new AccountActivityImpl());
        factory.start();
    }
}
