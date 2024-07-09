<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modify room</title>
    
    <!-- CSS and Bootstrap links -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    
    <!-- Google Web Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&family=Montserrat:wght@400;500;600;700&display=swap" rel="stylesheet">
    
    <!-- Template Stylesheet -->
    <link href="${request.contextPath}/css/style.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>Modify room</h1>
              <form action="ModifierRoom" method="post">
            <input type="hidden" name="room_id" value="${room.room_id}">
            
            <div class="form-group">
    <label for="room_type">Room Type:</label>
    <select id="room_type" name="room_type">
        <option value="Single Room">Single Room</option>
        <option value="Double Room">Double Room</option>
        <option value="Suite">Suite</option>
    </select>
</div>
         
             <div class="form-group">
                <label for="nb_beds">Number of beds</label>
                <input type="number" class="form-control" id="nb_beds" name="nb_beds" value="${room.nb_beds}" required>
            </div>

             
             <div class="form-group">
                <label for="img_url">Room image</label>
                <input type="text" class="form-control" id="img_url" name="img_url" value="${room.img_url}" required>
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
