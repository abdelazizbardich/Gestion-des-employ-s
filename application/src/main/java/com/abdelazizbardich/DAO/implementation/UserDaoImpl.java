package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.DAO.interfaces.UserDao;
import com.abdelazizbardich.models.Employe;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean setAsGoneOut() {
        return false;
    }

    @Override
    public Employe get() {
        return null;
    }

    @Override
    public ArrayList<Employe> getAll() {
        return null;
    }

    @Override
    public Employe add() {
        return null;
    }

    @Override
    public Employe update() {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }
}
