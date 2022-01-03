package com.crehana.operations.dto;

import com.crehana.operations.enums.OperationType;

public class OperationDTO {

    private Double numberOne;
    private Double numberTwo;
    private OperationType type;
    private Double result;

    public OperationDTO(Double numberOne, Double numberTwo, OperationType type) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.type = type;
    }

    public Double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;
    }

    public Double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
