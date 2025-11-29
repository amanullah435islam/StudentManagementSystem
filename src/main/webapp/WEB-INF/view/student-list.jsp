<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<h2>All Students</h2>

<a href="${pageContext.request.contextPath}/students/new">Add New Student</a>

<table border="1" cellpadding="8" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Department</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.department}</td>
            <td>
                <a href="${pageContext.request.contextPath}/students/edit/${student.id}">Edit</a> |
                <a href="${pageContext.request.contextPath}/students/delete/${student.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
