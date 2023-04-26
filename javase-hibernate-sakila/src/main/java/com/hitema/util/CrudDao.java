package com.hitema.util;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T, Id> {
    T get(Id id);

    List<T> getAll();

    void delete(Id t);

    void create(T t);

    void update(Long l, String country);
}
