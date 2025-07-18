package com.vozesdacomunidade.init.service.implement;

public interface ImplementExtends<T> {
    void save(T object);
    void disable(T object);
    T update(T object);
}
