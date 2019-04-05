/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Admin;

/**
 *
 * @author asus
 */
public interface AdminDao {
    public boolean register(Admin admin);
    public Admin login(String username, String password);
}
