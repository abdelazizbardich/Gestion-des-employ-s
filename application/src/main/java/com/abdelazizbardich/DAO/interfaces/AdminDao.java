package com.abdelazizbardich.DAO.interfaces;

import com.abdelazizbardich.entities.Admin;

import java.util.List;

public interface AdminDao {
    Admin add(Admin admin);
    Admin find(long id);
    Admin findByEmail(String email);
    List<Admin> getAll();
    Admin update(Admin admin);
    boolean delete(long id);
}
