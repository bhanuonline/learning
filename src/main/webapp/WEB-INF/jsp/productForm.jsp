<!DOCTYPE html>
<html>
<head>
    <title>Product Form</title>
</head>
<body>
<h1>Create Product</h1>
<form action="/saveProduct" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br><br>

    <label for="price">Price:</label>
    <input type="number" step="0.01" id="price" name="price" required><br><br>

    <button type="submit">Save Product</button>
</form>
</body>
</html>
