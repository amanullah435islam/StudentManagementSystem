
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<h2>${student.id == null ? 'Add Student' : 'Edit Student'}</h2>

<form action="${pageContext.request.contextPath}/students" method="post">
    <input type="hidden" name="id" value="${student.id}" />

    Name: <input type="text" name="name" value="${student.name}" required /><br><br>
    Age: <input type="number" name="age" value="${student.age}" required /><br><br>
    Department: <input type="text" name="department" value="${student.department}" required /><br><br>

    <input type="submit" value="Save" />
</form>

<a href="${pageContext.request.contextPath}/students">Back to List</a>
</body>
</html>
