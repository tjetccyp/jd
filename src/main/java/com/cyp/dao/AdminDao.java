package com.cyp.dao;

import com.cyp.domain.Admin;

import java.util.List;

public interface AdminDao {
    int addAdmin(Admin admin);
    int removeAdminById(int id);
    int updateAdmin(Admin admin);
    Admin findAdminById(int id);
    List<Admin> list();
}
