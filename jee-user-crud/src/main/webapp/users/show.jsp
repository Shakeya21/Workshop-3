<%--
  Created by IntelliJ IDEA.
  User: jessika
  Date: 02.06.2023
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/users/header.jsp" %>
<div class="container-fluid">
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
        <a href="<c:url value="/user/list"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class='fas fa-list' style="color:white"></i> Lista użytkowników</a>
    </div>
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Szczegóły użytkownika</h6>
        </div>
        <div class="card-body">

            <table class="table">
                <tbody>
                <tr>
                    <th>Id:</th>
                    <td>${user.id}</td>

                </tr>
                <tr>
                    <th>Nazwa użytkownika:</th>
                    <td>${user.userName}</td>
                </tr>
                <tr>
                    <th>Email:</th>
                    <td>${user.email}</td>
                </tr>
                </tbody>
            </table>

        </div>
    </div>
</div>
</div>
<%@ include file="/users/footer.jsp" %>
</html>