<%--
  Created by IntelliJ IDEA.
  User: jessika
  Date: 02.06.2023
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/users/header.jsp" %>
<div class="container-fluid">

    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Strona główna</h1>
        <a href="/user/list" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class='fas fa-list' style="color: white"></i> Lista użytkowników </a>
    </div>
    <div class="row">
    </div>
    <center><img src="/theme/gif/main.gif" alt="Hello everyone!"/></center>
</div>
</div>
<%@ include file="/users/footer.jsp" %>
</html>