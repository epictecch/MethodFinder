package com.example.methodfinder;

public interface IEntityService<E> {

    String methodWithoutParameter();

    String methodWithParameter(E entity);
}
