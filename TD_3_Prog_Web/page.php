<!DOCTYPE html>
<html>
    <head>
        <title>TD 3 - Programmation web côté serveur</title>
        <meta charset="utf-8"/>
        <link rel="stylesheet" href="style.css" type="text/css" />
    </head>
    <body style="color:#CCC">
        <h1>Votre résultat :</h1>
        <?php 
        touch("toto.txt");
        eval('$res = '.$_POST["n1"].''.$_POST["op"].''.$_POST["n2"].';');
        echo $res;
        ?>
    </body>
</html>