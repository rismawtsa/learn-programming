<?php

$servername = "localhost";
$username = "root";
$password = "";

try {
    $conn = new PDO("mysql:host=$servername;dbname=mydatabase", $username, $password);
    // set the PDO error mode to exception
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);


    $stmt = $conn->prepare("INSERT INTO animals (animal_name, animal_color) VALUES (:animalName, :animalColor)");
    $stmt->bindParam(':animalName', $animalName);
    $stmt->bindParam(':animalColor', $animalColor);

    $animalName = 'Cat';
    $animalColor = 'brown';
    $stmt->execute();

    $id = $conn->lastInsertId();
    echo "New records created successfully with id ".$id;
} catch(PDOException $e) {
    echo $sql . "<br>" . $e->getMessage();
}
