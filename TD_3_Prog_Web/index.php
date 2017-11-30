<!DOCTYPE html>
<html>
    <head>
        <title>TD 3 - Programmation web côté serveur</title>
        <meta charset="utf-8"/>
        <link rel="stylesheet" href="style.css" type="text/css" />
    </head>
    <body>
        <form method="POST" action="page.php">
            <h1>Votre premier numéro :</h1>
            <input type="text" name="n1"/>
            <select name="op">
                <option selected="selected">+</option>
                <option selected="selected">-</option>
                <option selected="selected">*</option>
                <option selected="selected">/</option>
            </select>
            <input type="text" name="n2"/>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
<?php
?>