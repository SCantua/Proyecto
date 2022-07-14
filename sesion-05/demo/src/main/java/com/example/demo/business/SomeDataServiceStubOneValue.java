package com.example.demo.business;

public class SomeDataServiceStubOneValue implements SomeDataService{
    @Override
    public int[] retrieveAllData(){
        return new int[] {5};
    }
}
