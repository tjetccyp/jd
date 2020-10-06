package com.cyp.dao;

import com.cyp.domain.Indent;

import java.util.List;

public interface IndentDao {
    int addIndent(Indent indent);
    int removeIndentById(int id);
    int updateIndent(Indent indent);
    Indent findIndentById(int id);
    List<Indent> list();
}
