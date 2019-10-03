/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok20;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author ADMIN-LABMM04
 */
@Stateless
@LocalBean
public class ValidasiSession {
public boolean nama(String param) {
        try{
            if(param.isEmpty()){
                return false;
            }
            if(param.length()<=1){
                return false;
            }
        }catch(NullPointerException e){
            return false;
        }
        return true;
    }

    public boolean nim(String param) {
        try{
            Long.parseLong(param);
        }catch(NumberFormatException e){
            return false;
        }
        if(param.isEmpty()){
            return false;
        }
        if(param.length()<14){
            return false;
        }
        return true;
    }

}
