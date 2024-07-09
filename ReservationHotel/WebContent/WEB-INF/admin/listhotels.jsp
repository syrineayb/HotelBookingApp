<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List Hotels</title>
    
    <!-- CSS and Bootstrap links -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    
    <!-- Google Web Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&family=Montserrat:wght@400;500;600;700&display=swap" rel="stylesheet">
    
    <!-- Template Stylesheet -->
    <link href="${request.contextPath}/css/style.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>List Hotels</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>arrival date</th>
                    <th>departure date</th>
                   <th>nb adults</th>
                    <th>nb children </th>
                    <th>nb rooms</th>
                    <th>img</th>
                    <th>Description</th>
                    <th>Price</th>
   
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${AllHotels}" var="hotel">
                    <tr>
                        <td>${hotel.hotel_id}</td>
                        <td>${hotel.hotel_name}</td>
                        <td>${hotel.hotel_address}</td>
                        <td>${hotel.arrival_date}</td>
                        <td>${hotel.departure_date}</td>
                        <td>${hotel.nb_adults}</td>
                        <td>${hotel.nb_children}</td>
                        <td>${hotel.nb_rooms}</td>
                          <td>
                            <img src="${hotel.img_url}" alt="Hotel Image" width="100" height="100">
                        </td>
                        <td>${hotel.description}</td>
                        <td>${hotel.hotel_price}</td> 
                        
                        <td>
                            <a href="ModifierHotel?id=${hotel.hotel_id}" class="btn btn-primary">Edit</a>
                            <a href="SupprimerHotel?id=${hotel.hotel_id}" class="btn btn-danger">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="AjoutHotel">Add Hotel</a>
        
    </div>
    
    <!-- JavaScript links -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
