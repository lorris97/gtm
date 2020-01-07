<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>


<html>
    <body>

<c:forEach  items="${liste}" >
          <option value="${name.nom}"> ${name.nom} </option>
</c:forEach>
        
    </body> 
</html>