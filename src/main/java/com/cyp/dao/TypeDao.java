package com.cyp.dao;

import com.cyp.domain.ProType;

import java.util.List;

public interface TypeDao {
    int addTypeUser(ProType proType);
    int removeUserById(int id);
    int updateType(ProType proType);
    ProType findTypeById(int id);
    List<ProType> list();
}
