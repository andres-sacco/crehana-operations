package com.crehana.operations.service;

import com.crehana.operations.dto.OperationDTO;
import com.crehana.operations.validator.OperationValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationServiceTest {

    @Test
    public void should_return_sum_two_numbers() {

        //when
        OperationValidator validator = new OperationValidator();
        OperationService service = new OperationService(validator);

        Double numberOne = 1d;
        Double numberTwo = 1d;

        //given
        OperationDTO result = service.sum(numberOne, numberTwo);

        //then
        Assertions.assertEquals(2d, result.getResult());
    }
}