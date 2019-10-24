/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok18;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN-LABMM04
 */
@WebServlet(name = "Mahasiswaaa", urlPatterns = {"/Mahasiswa"})
public class Mahasiswaaa extends HttpServlet {

    MahaLocal maha = lookupMahaLocal();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Mahasiswa.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if("Tambah".equals(request.getParameter("submit"))){
            maha.nambah(request.getParameter("nama"),request.getParameter("nim"));
            request.setAttribute("namaEr", request.getParameter("nama")+" Berhasil ditambahkan");
            request.setAttribute("nimEr", request.getParameter("nim")+" Berhasil ditambahkan");
        }
        else if("Cari".equals(request.getParameter("submit"))){
            if (maha.search(request.getParameter("namasearch")) !=null){
                request.setAttribute("hasil", maha.search(request.getParameter("namasearch")));
            }
            else{
                request.setAttribute("hasil", "Mahasiswa tidak terdaftar");
            }
        }
            processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private MahaLocal lookupMahaLocal() {
        try {
            Context c = new InitialContext();
            return (MahaLocal) c.lookup("java:global/Tugas_Modul2/Tugas_Modul2-ejb/Maha!kelompok18.MahaLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
