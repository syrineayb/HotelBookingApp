<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add room</title>
    
    <!-- CSS and Bootstrap links -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    
    <!-- Google Web Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&family=Montserrat:wght@400;500;600;700&display=swap" rel="stylesheet">
    
    <!-- Template Stylesheet -->
    <link href="${request.contextPath}/css/style.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>Add room</h1>
        <form action="AjoutRoom" method="post">
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
                <input type="number" class="form-control" id="nb_beds" name="nb_beds" required>
            </div>
            
          <div class="form-group">
                <label for="img_url">Room image</label>
                <input type="text" class="form-control" id="img_url" name="img_url" required>
            </div>
        

              <input type="submit" value="Ajouter">
              
           <!--<button type="submit" class="btn btn-primary">Add</button>  --> 
        </form>
    </div>
    
 
</body>
</html>