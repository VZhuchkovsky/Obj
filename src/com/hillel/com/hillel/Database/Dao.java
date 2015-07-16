package com.hillel.com.hillel.Database;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public interface Dao<T>{
    void deleteCurrent();

    void insert(T model);

    void updateCurrent(T model);

    T getPrevious();

    T getNext();

    void close();
}
