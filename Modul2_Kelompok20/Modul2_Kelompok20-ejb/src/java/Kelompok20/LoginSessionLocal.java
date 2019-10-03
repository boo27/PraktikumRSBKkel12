/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok20;

import javax.ejb.Local;

/**
 *
 * @author ADMIN-LABMM04
 */
@Local
public interface LoginSessionLocal {

    boolean Login(String Nama, String NIM);

    boolean isLoginStatus();
    
    void setLoginStatus(boolean loginStatus);
    
}
