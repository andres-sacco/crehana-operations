package com.crehana.operations.service;

import com.crehana.operations.dto.OperationDTO;
import com.crehana.operations.exception.CrehanaException;
import com.crehana.operations.validator.OperationValidator;
import org.junit.jupiter.api.*;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OperationServiceTest {

    @BeforeAll
    void pre_execution_all() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void pre_execution() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void post_execution() {
        System.out.println("AfterEach");
    }

    @AfterAll
    void post_execution_all() {
        System.out.println("AfterAll");
    }

    @Test
    @Disabled
    @DisplayName("Should return the correct sum of two numbers")
    public void should_return_sum_two_numbers() {

        //given
        OperationValidator validator = new OperationValidator();
        OperationService service = new OperationService(validator);

        Double numberOne = 1d;
        Double numberTwo = 1d;

        //when
        OperationDTO result = service.sum(numberOne, numberTwo);

        //then
        Assertions.assertEquals(2d, result.getResult());
    }

    @Test
    @DisplayName("Should return an exception when the parameters are wrong")
    public void should_return_exception_when_parameters_wrong() {

        //given
        OperationValidator validator = new OperationValidator();
        OperationService service = new OperationService(validator);

        Double numberOne = null;
        Double numberTwo = 1d;

        //when
        Exception exception = Assertions.assertThrows(CrehanaException.class, () -> {
            service.sum(numberOne, numberTwo);
        });

        //then
        Assertions.assertEquals("Operation contains something wrong", exception.getMessage());
    }


    @Test
    @DisplayName("Should return the correct subtract of two numbers")
    public void should_return_subtract_two_numbers() {

        //given
        OperationValidator validator = new OperationValidator();
        OperationService service = new OperationService(validator);

        Double numberOne = 1d;
        Double numberTwo = 1d;

        //when
        OperationDTO result = service.subtract(numberOne, numberTwo);

        //then
        Assertions.assertEquals(0d, result.getResult());
    }
}