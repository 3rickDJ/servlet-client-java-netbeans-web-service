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
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compu Salchichas</title>
        <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
    </head>
    <body class="bg-gray-100 flex items-center justify-center min-h-screen">
        <div class="bg-white p-6 rounded-lg shadow-md w-96">
            <h2 class="text-2xl font-bold text-center mb-4">Inicia Sesión</h2>
            <form action="ClienteAlumno" method="post">
                <div class="mb-4">
                    <label for="usuario" class="block text-gray-700">Usuario:</label>
                    <input type="text" id="usuario" name="text1" class="mt-1 block w-full border-gray-300 rounded-md shadow-sm focus:border-blue-500 focus:ring focus:ring-blue-500 focus:ring-opacity-50" placeholder="Ingrese su usuario" />
                </div>
                <div class="mb-4">
                    <label for="contraseña" class="block text-gray-700">Contraseña:</label>
                    <input type="password" id="contraseña" name="text3" class="mt-1 block w-full border-gray-300 rounded-md shadow-sm focus:border-blue-500 focus:ring focus:ring-blue-500 focus:ring-opacity-50" placeholder="Ingrese su contraseña" />
                </div>
                <input type="hidden" name="Oper" value="5"/>
                <div>
                    <input type="submit" value="Ejecutar" class="w-full bg-blue-500 text-white font-bold py-2 rounded-md hover:bg-blue-600 transition duration-200"/>
                </div>
            </form>
        </div>
    </body>
</html>

<%--
Mostrar Alumnos: <input type="radio" name="Oper" value="2" checked=""/>
--%>
