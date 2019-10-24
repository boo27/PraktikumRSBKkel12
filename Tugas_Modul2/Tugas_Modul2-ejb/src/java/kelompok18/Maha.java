/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok18;

import javax.ejb.Stateful;
import java.util.ArrayList;

/**
 *
 * @author ADMIN-LABMM04
 */
@Stateful
public class Maha implements MahaLocal {
    ArrayList<Siswa> Mahasiwa = new ArrayList<Siswa>();
    
    public void nambah(String nama, String nim){
        Mahasiwa.add(new Siswa(nama,nim));
    }
    
    public Maha(){
        nambah("Muhammad Taqiyuddin","21120116140087");
        nambah("Usman Ralih Muis","21120116120020");
        nambah("Muhammad Ikhsan","21120116120033");
        nambah("Jaremy Karisma","21120116140078");
        nambah("Dhyn","666");
    }
    
    private String checkNama(String param){
        for (int i = 0; i < Mahasiwa.size(); i++){
            if (param.equals(Mahasiwa.get(i).nama)){
                return "Nama Praktikan : "+Mahasiwa.get(i).nama+"("+Mahasiwa.get(i).nim+")";
            }
        }
        return null;
    }
    
    private String checkNim (String param){
        for (int i = 0; i < Mahasiwa.size(); i++){
        if (param.equals(Mahasiwa.get(i).nim)){
            return "Nama Praktikan : "+Mahasiwa.get(i).nim+"("+Mahasiwa.get(i).nama+")";
        }
    }
        return null;
    }
    
    public String search(String param){
        if (checkNama(param) !=null) {
            return checkNama(param);
        }
        else if (checkNim(param)!=null) {
            return checkNim(param);
        }
        return "Tidak ada";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
