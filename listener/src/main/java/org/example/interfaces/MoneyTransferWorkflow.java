package org.example.interfaces;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;
import org.example.model.DTO.MoneyTransferRequest;

@WorkflowInterface
public interface MoneyTransferWorkflow {
    @WorkflowMethod
    public void transfer(MoneyTransferRequest moneyTransferRequest);
}
