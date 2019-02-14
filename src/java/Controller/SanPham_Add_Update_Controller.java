/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.NSXBean;
import Bean.SanPhamBean;
import Bo.NSXBo;
import Bo.SanPhamBo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Trí Nguyễn
 */
public class SanPham_Add_Update_Controller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        SanPhamBean sp = new SanPhamBean();
        SanPhamBo spBO = new SanPhamBo();
        sp.setName_SP(request.getParameter("Name_SP"));
        sp.setDate_NSX(Date.valueOf(request.getParameter("Date_NSX")));
        sp.setStatus(request.getParameter("Status"));
        sp.setID_NSX(Integer.parseInt(request.getParameter("NSX")));
        if (request.getParameter("ID_SP") != null) {
            sp.setID_SP(Integer.parseInt(request.getParameter("NSX")));
            spBO.Update(sp);
        } else {
            spBO.Insert(sp);
        }
        response.sendRedirect("SanPhamHome");
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

}
