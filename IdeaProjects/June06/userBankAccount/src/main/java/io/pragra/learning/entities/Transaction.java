package io.pragra.learning.entities;

import java.lang.reflect.Type;
import java.time.LocalDateTime;

public class Transaction {
    private Type transactionType;
    private LocalDateTime trxDate;
    private int id;
    private double charge;
}
