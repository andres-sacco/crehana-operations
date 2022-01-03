package com.crehana.operations.service;

import com.crehana.operations.dto.OperationDTO;
import com.crehana.operations.enums.OperationType;
import com.crehana.operations.exception.CrehanaException;
import com.crehana.operations.validator.OperationValidator;

public class OperationService {

    private final OperationValidator validator;

    public OperationService(OperationValidator validator) {
        this.validator = validator;
    }
    
    public OperationDTO sum(Double numberOne, Double numberTwo) {
        OperationDTO operation = new OperationDTO(numberOne, numberTwo, OperationType.SUM);

        validOperation(operation);

        double result = operation.getNumberOne() + operation.getNumberTwo();
        operation.setResult(result);

        return operation;
    }

    public OperationDTO subtract(Double numberOne, Double numberTwo) {
        OperationDTO operation = new OperationDTO(numberOne, numberTwo, OperationType.SUBTRACT);

        validOperation(operation);

        double result = operation.getNumberOne() - operation.getNumberTwo();
        operation.setResult(result);

        return operation;
    }

    public OperationDTO multiplication(Double numberOne, Double numberTwo) {
        OperationDTO operation = new OperationDTO(numberOne, numberTwo, OperationType.MULTIPLICATION);

        validOperation(operation);

        double result = operation.getNumberOne() * operation.getNumberTwo();
        operation.setResult(result);

        return operation;
    }

    public OperationDTO division(Double numberOne, Double numberTwo) {
        OperationDTO operation = new OperationDTO(numberOne, numberTwo, OperationType.DIVISION);

        validOperation(operation);

        double result = operation.getNumberOne() / operation.getNumberTwo();
        operation.setResult(result);

        return operation;
    }

    private void validOperation(OperationDTO operation) {
        if (!validator.isValid(operation)) {
            throw new CrehanaException("Operation contains something wrong");
        }
    }
}
