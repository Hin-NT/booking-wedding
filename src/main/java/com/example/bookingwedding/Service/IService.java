package com.example.bookingwedding.Service;

import java.util.List;

public interface IService<T> {
    boolean insert(T t);

    List<T> selectAll();
}
