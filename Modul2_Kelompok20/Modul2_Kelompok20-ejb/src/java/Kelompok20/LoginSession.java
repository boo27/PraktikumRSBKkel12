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
    
    String [] nama = {"M Taqiyuddin", "Usman Ralih M", "M Ikhsan", "Jeremy K", "Dhyn"};
    String [] nim = {"21120116140087", "21120116120000", "21120116120033", "21120116140078", "666"};
    
    private String checkNama(String param){
        for (int i = 0; i < nama.length; i++){
            if (param.equals(nama[i])){
                return "Nama Praktikan : "+nama[i]+"("+nim[i]+")";
            }
        }
        return null;
    }
    
    private String checkNim (String param){
        for (int i = 0; i < nim.length; i++){
        if (param.equals(nim[i])){
            return "Nama Praktikan : "+nama[i]+"("+nim[i]+")";
        }
    }
        return null;
    }
    @Override
    public String search(String param){
        if (checkNama(param) !=null) return checkNama(param);
        else if (checkNim(param)!=null) return checkNim(param);
        return null;
    }

}
