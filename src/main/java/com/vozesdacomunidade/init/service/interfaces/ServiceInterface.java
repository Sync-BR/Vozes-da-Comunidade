package com.vozesdacomunidade.init.service.interfaces;

public interface ServiceInterface<T> {
    void save(T object);
    void disable(T object);
    T update(T object);
}
