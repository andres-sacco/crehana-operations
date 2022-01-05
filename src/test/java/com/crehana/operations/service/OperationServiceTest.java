package com.crehana.operations.service;

import com.crehana.operations.dto.OperationDTO;
import com.crehana.operations.exception.CrehanaException;
import com.crehana.operations.validator.OperationValidator;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OperationServiceTest {

    private OperationValidator validator;

    @BeforeAll
    void pre_execution_all() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void pre_execution() {
        System.out.println("BeforeEach");
        validator = Mockito.mock(OperationValidator.class);
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

    @Test
    @DisplayName("Should return the correct multiplication of two numbers")
    public void should_return_multiplication_two_numbers() {

        //given
        OperationValidator validator = new OperationValidator();
        OperationService service = new OperationService(validator);

        Double numberOne = 1d;
        Double numberTwo = 1d;

        //when
        OperationDTO result = service.multiplication(numberOne, numberTwo);

        //then
        Assertions.assertAll(
                () -> Assertions.assertEquals(1d, result.getResult()),
                () -> Assertions.assertEquals(1d, result.getNumberOne()),
                () -> Assertions.assertEquals(1d, result.getNumberTwo())
        );
    }

    @Test
    @DisplayName("Subtract should return an exception when the parameters are wrong")
    public void subtract_should_return_exception_when_parameters_wrong() {

        //given
        OperationService service = new OperationService(validator);

        Double numberOne = null;
        Double numberTwo = 1d;

        Mockito.when(validator.isValid(Mockito.any())).thenReturn(Boolean.FALSE);

        //when
        Exception exception = Assertions.assertThrows(CrehanaException.class, () -> {
            service.subtract(numberOne, numberTwo);
        });

        //then
        Assertions.assertEquals("Operation contains something wrong", exception.getMessage());
    }


    @Test
    @DisplayName("Should return the correct module of two numbers")
    public void should_return_module_two_numbers() {
        //given
        OperationValidator validator = new OperationValidator();
        OperationService service = new OperationService(validator);

        Double numberOne = 2d;
        Double numberTwo = 1d;

        //when
        OperationDTO result = service.module(numberOne, numberTwo);

        //then
        Assertions.assertAll(
                () -> Assertions.assertEquals(0d, result.getResult()),
                () -> Assertions.assertEquals(2d, result.getNumberOne()),
                () -> Assertions.assertEquals(1d, result.getNumberTwo())
        );
    }

}