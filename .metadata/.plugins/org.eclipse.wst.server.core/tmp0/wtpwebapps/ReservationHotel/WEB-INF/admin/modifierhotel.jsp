<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modify Hotel</title>
    
    <!-- CSS and Bootstrap links -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    
    <!-- Google Web Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&family=Montserrat:wght@400;500;600;700&display=swap" rel="stylesheet">
    
    <!-- Template Stylesheet -->
    <link href="${request.contextPath}/css/style.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>Modify Hotel</h1>
              <form action="ModifierHotel" method="post">
            <input type="hidden" name="hotel_id" value="${hotel.hotel_id}">
            
            <div class="form-group">
                <label for="hotel_name">Hotel Name</label>
                <input type="text" class="form-control" id="hotel_name" name="hotel_name" value="${hotel.hotel_name}" required>
            </div>
            <div class="form-group">
                <label for="hotel_address">Hotel Address</label>
                <input type="text" class="form-control" id="hotel_address" name="hotel_address" value="${hotel.hotel_address}" required>
            </div>
            <div class="form-group">
                <label for="arrival_date">Arrival date</label>
                <input type="date" class="form-control" id="arrival_date" name="arrival_date" value="${hotel.arrival_date}" required>
            </div>
           
            <div class="form-group">
                <label for="departure_date">departure_date</label>
                <input type="date" class="form-control" id="departure_date" name="departure_date" value="${hotel.departure_date}" required>
            </div>
            
           
            
             <div class="form-group">
                <label for="nb_adults">nb_adults</label>
                <input type="number" class="form-control" id="nb_adults" name="nb_adults" value="${hotel.nb_adults}" required>
            </div>
            
             <div class="form-group">
                <label for="nb_children">nb_children</label>
                <input type="number" class="form-control" id="nb_children" name="nb_children" value="${hotel.nb_children}" required>
            </div>
              <div class="form-group">
                <label for="nb_children">nb_rooms</label>
                <input type="number" class="form-control" id="nb_rooms" name="nb_rooms" value="${hotel.nb_rooms}" required>
            </div>
             <div class="form-group">
                <label for="img_url">img_url</label>
                <input type="text" class="form-control" id="img_url" name="img_url" value="${hotel.img_url}" required>
            </div>
            
             <div class="form-group">
                <label for="description">description</label>
                <input type="text" class="form-control" id="description" name="description" value="${hotel.description}" required>
            </div>
            <div class="form-group">
                <label for="hotel_price">hotel_price</label>
                <input type="number" class="form-control" id="hotel_price" name="hotel_price" value="${hotel.hotel_price}" required>
            </div>
            
            
            
           <input type="submit" value="Modifier">
            
            
          <!-- <button type="submit" class="btn btn-primary">Update</button>
            --> 
        </form>
    </div>
    
    <!-- JavaScript links -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
