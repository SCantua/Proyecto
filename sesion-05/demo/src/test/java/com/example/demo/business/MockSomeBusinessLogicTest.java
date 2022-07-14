package com.example.demo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockSomeBusinessLogicTest {
    @Test
    public void calculateSumMock(){
        SomeBusinessLogic business = new SomeBusinessLogic();
        SomeDataService dataServiceMock = mock(SomeDataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
        business.setSomeDataService(dataServiceMock);
        int actualResult = business.calculateSumWithADataService();
        assertEquals(6, actualResult);
    }

    @Test
    public void calculateSumMockEmpty(){
        SomeBusinessLogic business = new SomeBusinessLogic();
        SomeDataService dataServiceMock = mock(SomeDataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        business.setSomeDataService(dataServiceMock);
        int actualResult = business.calculateSumWithADataService();
        assertEquals(0, actualResult);
    }

    @Test
    public void calculateSumMockOneValue(){
        SomeBusinessLogic business = new SomeBusinessLogic();
        SomeDataService dataServiceMock = mock(SomeDataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
        business.setSomeDataService(dataServiceMock);
        int actualResult = business.calculateSumWithADataService();
        assertEquals(5, actualResult);
    }

}