/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok18;

import javax.ejb.Local;

/**
 *
 * @author ADMIN-LABMM04
 */
@Local
public interface MahaLocal {
    String search(String param);
    void nambah(String nama, String nim);
}
