/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bash
 */
@WebServlet(name="pedido_nuevo")
public class Pedido_nuevo extends HttpServlet {

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
        
        int id_bebida = Integer.parseInt(request.getParameter("bebida"));
        int id_hamburguesa = Integer.parseInt(request.getParameter("hamburguesa"));
        int id_postre = Integer.parseInt(request.getParameter("postre"));
        
        Bebida_DAO bebida_dao = new Bebida_DAOImp();
        Bebida bebida = bebida_dao.findById(id_bebida);
        Hamburguesa_DAO hamburguesa_dao = new Hamburguesa_DAOImp();
        Hamburguesa hamburguesa = hamburguesa_dao.findById(id_hamburguesa);
        Postre_DAO postre_dao = new Postre_DAOImp();
        Postre postre = postre_dao.findById(id_postre);
        
        request.getSession().setAttribute("bebida",bebida);
        request.getSession().setAttribute("hamburguesa",hamburguesa);
        request.getSession().setAttribute("postre",postre);
        
        response.sendRedirect("confirmar_pedido.jsp");
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
