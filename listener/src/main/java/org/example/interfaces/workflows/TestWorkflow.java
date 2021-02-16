package org.example.interfaces.workflows;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;
import org.example.model.DTO.DefaultRequest;

@WorkflowInterface
public interface TestWorkflow {
    @WorkflowMethod
    public void testWorkflow(DefaultRequest defaultRequest);
}
