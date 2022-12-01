<?php

require 'vendor/autoload.php';

$client = new MongoDB\Client('mongodb://localhost:27017');
$friends = $client->myNewDatabase->inventory;
$result = $friends->find(array());

$data = iterator_to_array($result);
print_r($data);
?>