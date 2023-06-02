<%--
  Created by IntelliJ IDEA.
  User: jessika
  Date: 02.06.2023
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/users/header.jsp" %>
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
        <a href="<c:url value="/user/list"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class='fas fa-list' style="color:white"></i> Lista użytkowników</a>
    </div>
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Dodaj użytkownika</h6>
        </div>
        <div class="card-body">
            <form method="post">
                <div class="form-group">
                    <label for="username">Nazwa</label>
                    <input name="username" type="text" class="form-control" id="username"
                           placeholder="Podaj Nazwę użytkownika">
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input name="email" type="email" class="form-control" id="email"
                           placeholder="Podaj Email">
                </div>
                <div class="form-group">
                    <label for="password">Hasło</label>
                    <input name="password" type="password" class="form-control" id="password"
                           placeholder="Podaj Hasło">
                </div>

                <button type="submit" class="btn btn-primary">Dodaj Użytkownika</button>
            </form>

        </div>
    </div>
</div>
</div>
<%@ include file="/users/footer.jsp" %>


