package com.example.demo.business;

public class SomeDataServiceStubEmpty implements SomeDataService{
    @Override
    public int[] retrieveAllData(){
        return new int[] {};
    }
}
