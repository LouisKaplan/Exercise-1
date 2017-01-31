<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="head.jsp"%>

<html><body>

<div class="container-fluid">
    <h2>Search Results: </h2>
    <table>
        <tr>
            <th>ID           </th>
            <th>First Name   </th>
            <th>Last Name    </th>
            <th>Date of Birth</th>
            <th>Age          </th>

        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.userid}      </td>
                <td>${user.firstName}   </td>
                <td>${user.lastName}    </td>
                <td>${user.dateOfBirth} </td>
                <td>${user.calculateDate()}</td>
            </tr>
        </c:forEach>

    </table>

</div>

</body>
</html>
