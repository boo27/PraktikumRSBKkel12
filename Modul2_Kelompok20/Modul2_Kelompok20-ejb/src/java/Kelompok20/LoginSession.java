/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok20;

import javax.ejb.Stateful;

/**
 *
 * @author ADMIN-LABMM04
 */
@Stateful
public class LoginSession implements LoginSessionLocal {
    
    private final String [] Nama = {"Dhyn"};
    private final String [] Nim = {"21120116140087"};
    private boolean loginStatus = false;
    
    @Override
    public boolean Login(String Nama, String Nim) {
        return Nama.equals(this.Nama[0]) && Nim.equals(this.Nim[0]);
    }
    
    @Override
    public boolean isLoginStatus() {
        return loginStatus;
    }
    
    @Override
    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

}
