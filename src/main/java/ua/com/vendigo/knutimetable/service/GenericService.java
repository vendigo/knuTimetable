package ua.com.vendigo.knutimetable.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dmytro Marchenko on 01.03.2015.
 */
public interface GenericService<T, ID extends Serializable> {
    List<T> findAll();

    T findOne(ID id);

    <S extends T> S save(S object);

    void delete(ID id);
}
