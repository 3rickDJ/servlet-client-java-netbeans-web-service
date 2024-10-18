/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.serverlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.empresa.proyecto.ws.Alumnos;

/**
 *
 * @author erick
 */
@WebServlet(name = "ClienteAlumno", urlPatterns = {"/ClienteAlumno"})
public class ClienteAlumno extends HttpServlet {

	/**
	 * Processes requests for both HTTP <code>GET</code> and
	 * <code>POST</code> methods.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            int oper, idAlumno, Edad;
            String nombreAlumno, gradoEscolar;
            
            oper = Integer.parseInt(request.getParameter("Oper"));
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClienteAlumno</title>");            
            out.println("</head>");
            out.println("<body>");

            if (oper==1){
                nombreAlumno = request.getParameter("text1");
                Edad = Integer.parseInt(request.getParameter("text2"));
                gradoEscolar = request.getParameter("text3");
                out.println("<h1>"+ crearAlumno(nombreAlumno, Edad, gradoEscolar)+"</h1>");
            }
            else if (oper == 2) {
                List<Alumnos> alumnos = listarAlumno(); // Obtener la lista de alumnos

                if (alumnos != null && !alumnos.isEmpty()) {
                    out.println("<table border='0'>");
                    out.println("<tr><th>ID</th><th>Nombre</th><th>Edad</th><th>Grado Escolar</th></tr>");

                    for (Alumnos a : alumnos) {
                        out.println("<tr>");
                        out.println("<td>" + a.getId() + "</td>");
                        out.println("<td>" + a.getNombre() + "</td>");
                        out.println("<td>" + a.getEdad() + "</td>");
                        out.println("<td>" + a.getGradoEscolar() + "</td>");
                        out.println("</tr>");
                    }

                    out.println("</table>");
                } else {
                    out.println("<h2>No hay alumnos disponibles.</h2>");
                }
            }
            else if (oper==3){
                nombreAlumno = request.getParameter("text1");
                Edad = Integer.parseInt(request.getParameter("text2"));
                gradoEscolar = request.getParameter("text3");
                idAlumno = Integer.parseInt(request.getParameter("text4"));
                out.println("<h1>"+ "actualizarAlumno(idAlumno, nombreAlumno, Edad, gradoEscolar)" +"</h1>");
            }
            else if (oper==4){
                idAlumno = Integer.parseInt(request.getParameter("text4"));
                out.println("<h1>"+"eliminarAlumno(idAlumno)"+"</h1>");
            }
            
            out.println("<a href='http://localhost:8080/ClientAlumnosOwn/'> Regresar .../>");
            out.println("</body>");
            out.println("</html>");
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

	private static String crearAlumno(java.lang.String nombreAlumno, int edad, java.lang.String gradoEscolar) {
		com.empresa.proyecto.ws.AlumnosWebService_Service service = new com.empresa.proyecto.ws.AlumnosWebService_Service();
		com.empresa.proyecto.ws.AlumnosWebService port = service.getAlumnosWebServicePort();
		return port.crearAlumno(nombreAlumno, edad, gradoEscolar);
	}

	private static java.util.List<com.empresa.proyecto.ws.Alumnos> listarAlumno() {
		com.empresa.proyecto.ws.AlumnosWebService_Service service = new com.empresa.proyecto.ws.AlumnosWebService_Service();
		com.empresa.proyecto.ws.AlumnosWebService port = service.getAlumnosWebServicePort();
		return port.listarAlumno();
	}






















	
}


