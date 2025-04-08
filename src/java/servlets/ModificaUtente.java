package servlets;

import bean.Utenti;
import database.ConnectionManager;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.UtentiDAO;

/**
 *
 * @author Giovanni
 */
public class ModificaUtente extends HttpServlet {

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
        try{
            Utenti user = new Utenti();
            user.setCognome(request.getParameter("cognome"));
            user.setNome(request.getParameter("nome"));
            user.setUsername(request.getParameter("usr"));
            user.setPassword(request.getParameter("pwd"));
            user.setTelefono(request.getParameter("tel"));
            ConnectionManager cm = new ConnectionManager("localhost","3306","5bgm","root","root");
            UtentiDAO ud = new UtentiDAO();
            ud.edit(user, cm);
            //logger.info("registrazione eseguita");
            request.getSession().setAttribute("msgok", "Utente modificato correttamente");
            response.sendRedirect(request.getContextPath()+"/conferma.jsp");
            //logger.info("redirect eseguita");
        }	
        catch (Throwable theException){
            request.getSession().setAttribute("msgerr", theException.toString());
            response.sendRedirect(request.getContextPath()+"/errore.jsp");
            System.out.println(theException);
        }
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
