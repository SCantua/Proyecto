package com.example.demo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessLogicMockTest2 {
    @InjectMocks
    SomeBusinessLogic business;

    @Mock
    SomeDataService dataServiceMock;

    @Test
    public void calculateSumMock(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
        business.setSomeDataService(dataServiceMock);
        int actualResult = business.calculateSumWithADataService();
        assertEquals(6, actualResult);
    }

    @Test
    public void calculateSumMockEmpty(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        business.setSomeDataService(dataServiceMock);
        int actualResult = business.calculateSumWithADataService();
        assertEquals(0, actualResult);
    }

    @Test
    public void calculateSumMockOneValue(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
        business.setSomeDataService(dataServiceMock);
        int actualResult = business.calculateSumWithADataService();
        assertEquals(5, actualResult);
    }

}