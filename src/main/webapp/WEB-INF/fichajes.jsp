<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="listarFichajesEmpleado" method="post">
    <table class="table table-dark" align="center">
        <thead class="thead">
            <tr>
                <th scope="col">Estado</th>
                <th scope="col">Nombre Empleado</th>

            </tr>
        </thead>
        <tbody>
            <c:forEach items="${fichajes}" var="fichaje">
                <tr>
                    <td>${fichaje.estado}</td>
                    <td>${fichaje.nombreEmpleado}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</form>