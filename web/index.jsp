<%-- 
    Document   : index
    Created on : Oct 17, 2024, 10:50:20 PM
    Author     : erick
--%>

<%-- 
    Document   : index
    Created on : Oct 17, 2024, 10:50:20 PM
    Author     : erick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>    
        <h2>Alumnos</h2>
        <form action="ClienteAlumno">
            Nombre del Alumno: <input type="text" name="text1" value="" /> <br>
            Edad del alumno: <input type="text" name="text2" value="" /> <br>
            Grado del alumno: <input type="text" name="text3" value="" /> <br>
            Id del Alumno(Solo para eliminar o actualizar): <input type="text" name="text4" value="" /> <br>
            Crear Alumno: <input type="radio" name="Oper" value="1" />
            Mostrar Alumnos: <input type="radio" name="Oper" value="2" checked=""/>
            Actualizar Alumno <input type="radio" name="Oper" value="3" />
            Borrar Alumno: <input type="radio" name="Oper" value="4"/>
            Log In: <input type="radio" name="Oper" value="5"/>
            <br>
            <input type="submit" value="Ejecutar"/>
        </form>
    </body>
</html>

