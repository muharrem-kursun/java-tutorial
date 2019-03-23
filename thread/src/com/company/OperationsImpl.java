package com.company;

public class OperationsImpl implements Operations{

    @Override
    public int toplama(int a, int b) {
        return a+b;
    }

    @Override
    public int cikarma(int a, int b) {

        return a-b;
    }

    @Override
    public int carpma(int a, int b) {
        return a*b;
    }

    @Override
    public int bolme(int a, int b) {
        return a/b;
    }
}
