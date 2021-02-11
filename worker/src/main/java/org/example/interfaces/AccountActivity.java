package org.example.interfaces;

import io.temporal.activity.ActivityInterface;
import org.example.model.DTO.MoneyTransferRequest;

@ActivityInterface
public interface AccountActivity {

    public void deposit(MoneyTransferRequest moneyTransferRequest);

    public void withdraw(MoneyTransferRequest moneyTransferRequest);
}
