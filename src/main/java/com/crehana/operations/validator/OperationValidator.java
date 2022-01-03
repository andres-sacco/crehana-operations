package com.crehana.operations.validator;

import com.crehana.operations.dto.OperationDTO;
import com.crehana.operations.enums.OperationType;

import java.util.Objects;

public class OperationValidator {

    public boolean isValid(OperationDTO operation) {
        Boolean isValid = Boolean.TRUE;

        if(Objects.isNull(operation) ||
                Objects.isNull(operation.getNumberOne()) ||
                Objects.isNull(operation.getNumberTwo())) {
            isValid = Boolean.FALSE;

        } else if(operation.getType() == OperationType.DIVISION &&
                operation.getNumberTwo() == 0.0) {
            isValid = Boolean.FALSE;
        }

        return isValid;
    }
}
