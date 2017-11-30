<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <meta http-equiv="content-language" content="fr-FR"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Tests HTML | Rémy Vast</title>
        <link rel="stylesheet" href="reset.css"/>
        <link rel="stylesheet" href="style.css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js" type="text/javascript"></script>
        <script src="http://www.google.com/jsapi" type="text/javascript"></script>
        <script type="text/javascript">
            /* JS */
            /*function onChange(var range){
                $('#testimg').css("opacity", range);
                return true;
            }*/
            
            function outputUpdate(vol) {
                document.querySelector('#volume').value = vol;
            }
            function setOpacity(){
                document.getElementById("testimg").opacity=document.getElementById("range").value;
            }
            $(document).ready(function() {
                $("#testimg").setOpacity();
            });
        </script>
    </head>
    <body>
        <h1>TESTS</h1>
        <input type="range" name="cursor" orient="vertical" min="0" value="1" max="1" step="0.1" onChange="setOpacity()"/>
        <img src="testimg.jpg" id="testimg"></img>
        <output for="fader" id="volume">1</output>
    </body>
</html>