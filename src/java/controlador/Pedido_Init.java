/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.DAO.Bebida_DAO;
import modelo.DAO.Bebida_DAOImp;
import modelo.Entity.Bebida;

/**
 *
 * @author bash
 */
@WebServlet(name="pedido_init")
public class Pedido_Init extends HttpServlet {

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
        
        Bebida_DAO bebida_dao = new Bebida_DAOImp();
        List<Bebida> lista_bebidas = bebida_dao.findAllBebidas();
        Hamburguesa_DAO hamburguesa_dao = new Hamburguesa_DAOImp();
        List<Hamburguesa> lista_hamburguesas = hamburguesa_dao.findAllHamburguesas();
        Postre_DAO postre_dao = new Postre_DAOImp();
        List<Postre> lista_postres = postre_dao.findAllPostres();
        
        
        request.getSession().setAttribute("lista_bebidas", lista_bebidas);
        request.getSession().setAttribute("lista_hamburguesas", lista_hamburguesas);
        request.getSession().setAttribute("lista_postres", lista_postres);
        
        response.sendRedirect("nuevo_pedido.jsp");
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
