/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok18;

/**
 *
 * @author ADMIN-LABMM04
 */
public class Siswa {
    String nama, nim;
    
    public Siswa(String nama,String nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
}
