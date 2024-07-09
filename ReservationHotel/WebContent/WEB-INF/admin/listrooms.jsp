<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List Rooms</title>
    
    <!-- CSS and Bootstrap links -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    
    <!-- Google Web Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&family=Montserrat:wght@400;500;600;700&display=swap" rel="stylesheet">
    
    <!-- Template Stylesheet -->
    <link href="${request.contextPath}/css/style.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>List Rooms</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Type</th>
                    <th>Number of beds</th>

                    
                    <th>Image</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${AllRooms}" var="room">
                    <tr>
                        <td>${room.room_id}</td>
                        <td>${room.room_type}</td>
                        <td>${room.nb_beds}</td>
                         <td>
                            <img src="${room.img_url}" alt="Room Image" width="100" height="100">
                        </td>
                        <td>
                            <a href="ModifierRoom?id=${room.room_id}" class="btn btn-primary">Edit</a>
                            <a href="SupprimerRoom?id=${room.room_id}" class="btn btn-danger">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="AjoutRoom">Add Room</a>
        
    </div>
    
    <!-- JavaScript links -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
