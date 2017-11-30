<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
        <title>Controverse Num&eacute;rique</title>
        <link rel="stylesheet" href="reset.css" type="text/css" />
        <link rel="stylesheet" href="style.css" type="text/css" />
        <!--- BootStrap --->
        <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function() {
		        $('.js-scrollTo').on('click', function() { // Au clic sur un élément
			        var page = $(this).attr('href'); // Page cible
			        var speed = 700; // Durée de l'animation (en ms)
			    $('html, body').animate( {scrollTop: $(page).offset().top  - 80}, speed ); // Go
			    return false;
		    });
	    });
        </script>
    </head>
    <body>
        <div class="header">
            <ul>
                <li><a href="#bloc" class="js-scrollTo"><i class="fa fa-home"></i>&nbsp;Accueil</a></li>
                <li><a href="#bloc4" class="js-scrollTo"><i class="fa fa-calendar"></i>&nbsp;Chronologie</a></li>
                <li><a href="#bloc1" class="js-scrollTo"><i class="fa fa-users"></i>&nbsp;S'adapter</a></li>
                <li><a href="#bloc2" class="js-scrollTo"><i class="fa fa-qrcode"></i>&nbsp;Culture du numérique</a></li>
                <li><a href="#bloc3" class="js-scrollTo"><i class="fa fa-exclamation-triangle"></i>&nbsp;Face au numérique...</a></li>
                <li><a href="#bloc5" class="js-scrollTo"><i class="fa fa-bar-chart"></i>&nbsp;Quelques chiffres</a></li>
            </ul>
        </div>
        <div id="bloc" class="content">
            <div class="firstbloc">
                <div class="title">
                    <p>Controverse Numérique </p><br>
                    <p>Jusqu'où l'Homme peut-il maîtriser le numérique ?</p>
                </div>
            </div>
            <div class="secondbloc">
                <h1 id="bloc">Bienvenue !</h1>
                <ul class="textzone">
                    <li class="textbloc">
                        <p> Le déploiement dans notre vie et dans notre environnement du numérique, des technologies et des usages associés est en passe de modifier profondément notre humanité, d’altérer nombre de paramètres qui font que nous nous pensons humains et agissons comme tels.<br><br>

                            Ainsi le numérique change le rapport que nous entretenons avec notre mémoire et la manière dont nous pouvons envisager de transmettre les savoirs (opendata …). Il change notre manière d’entrer en contact et de rester en relation avec les autres (réseaux sociaux, jeux et avatars).<br><br>
                            Il change les modalités et les dynamiques d’action collective. Il détruit certains emplois et en fait émerger de nouveaux, sans que nous sachions encore s’il y aura équivalence en quantité et en qualité entre les uns et les autres. Il multiplie les possibilités de surveillance des individus et remodèle l’espace de leur vie privée.<br>
                        </p>
                    </li>
                </ul>
            </div>
            <div id=bloc4 class="fourthbloc" style="text-align:center;">
                <h1>Chronologie</h1>
                <img src="img/frise.png" style="width:80%;">&nbsp;</img>
            </div>
            <div id=bloc1 class="secondbloc">
                <h1>S'adapter</h1>
                    <h2><i class="fa fa-chevron-circle-right"></i>&nbsp;Dépassé par le numérique</h2><br>
                        <p> Les humains ont-il encore le temps désormais ou sont-ils emportés dans un tourbillon numérique qui les dépasse ? Qu’arrivera-t-il si trop d’humains à bord des organisations n’ont pas le « pied numérique » ? <br/><br/>
        
                            Risque d'affaiblissement et d'appauvrissement de la société à cause de
                            l'acceleration exponentielle du numérique. <br/><br/>
        
                            Certains ne peuvent plus se passer de la technologie. On peut en quelques 
                            sorte dire que la technologie les contrôle. On parle alors de 
                            cyberdépendance.
                        </p>
                    <h2><i class="fa fa-chevron-circle-right"></i>&nbsp;Adaptation au numérique</h2><br>
                        <p>Au fil des âges, toutes les technologies ont apporté bouleversements auxquels il a fallu s’habituer, mais aussi maitriser, contrôler, réguler..<br>
                        
                            La société elle-même a-t-elle encore le temps de s’organiser face aux usages numériques ?<br><br>
                            
                            Les sociétés précédentes ont été capable de mettre en œuvre les régulations, au fur et à mesure des besoins. Chacun de ces ajustements de société, chacune de ces limites, ont requis des temps de réflexion, des essais, des négociations, des aménagements de tous ordres; des processus qui ont demandé du temps…<br>
                            
                            Elle correspond à l’identité de cette personne associée à la perception que les internautes s'en font.<br><br>
                            
                            Les machines peuvent-elles être considérées comme intelligentes ? <br>
                            
                            Oui, en terme de calcul et de questions/réponses.<br><br>
                            
                            Les machines peuvent-elles être confondues avec un Homme ? <br>
                            
                            Oui, dans un contexte de test simple et logique. <br>
                            Non, une machine ne peut égaler l'esprit humain (conscience, intuition, ...)<br>
                        </p>
            </div>
            <div id=bloc2 class="thirdbloc">
                <h1>Culture du numérique</h1>
                    <h2><i class="fa fa-chevron-circle-right"></i>&nbsp;Facilitation de la vie par le numérique</h2><br>
                        <p>Les Nouvelles Technologies de l’Information et de la Communication (NTICS) ont bouleversé et changé de manière radicale notre vie quotidienne.<br/>Les usages des NTICS, notamment autour des réseaux sociaux, peuvent favoriser l’arrivée de nouvelles solutions, de nouvelles pratiques, de nouvelles structures, de produits innovants... Au-delà de la question des outils, une collaboration réussie suppose néanmoins d’avoir réuni un certain nombre de conditions organisationnelles et managériales (gouvernance, répartition des rôles et responsabilités…).
                        </p>
                        <p>Aujourd'hui, l’homme s’est créé un besoin dont il ne peut se passer. </p>
            </div>
            <div id=bloc3 class="secondbloc">
                <h1>Face au numérique...</h1>
                    <h2 id=bis1><i class="fa fa-chevron-circle-right"></i>&nbsp;L’Homme contre l’intelligence artificelle</h2><br>
                        <p>L'IA est un danger pour l'homme car la machine n'est pas capable d'interpréter ce qu'on lui demande.<br>
                           Beaucoup de scientifiques célèbres sont contre l'IA.<br><br>
                           Plus de 10 milions de dollars ont été investi dans des projets afin de se prémunir contre les potentiels danger de l'IA pour que les systèmes d’IA intègrent les préférences des humains en observant notre comportement.<br>
                        </p>
                    <h2 id=bis2><i class="fa fa-chevron-circle-right"></i>&nbsp;L’Homme contre le numérique</h2><br>
                        <h3><i class="fa fa-dot-circle-o"></i>&nbsp;L'e-réputation</h3>
                            <p>L'e-réputation, parfois appelée web-réputation, est la réputation (informations, avis, commentaires…) sur le Web d'une personne réelle ou virtuelle (compte d'une personne sur un réseau social ou autre site lambda).<br><br>
                                Le terme e-réputation est apparu en 2000 dans l'une des nombreuses études suisses-allemandes et américaines consacrées aux relations entre réputation du vendeur et performances des ventes sur les sites d'enchères en ligne. Le but est de noter le service ou la personne procurrant ce service afin d'améliorer ou dégrader la réputation de ce service.<br>
                            </p>
                        <h3><i class="fa fa-dot-circle-o"></i>&nbsp;L’identité numérique</h3>
                            <p>
                                Soigner son identité numérique : démarche essentielle pour se présenter à son avantage dans le cadre de la vie professionnelle<br><br>
                            </p>
            </div>
            <div id=bloc5 class="fifthbloc">
            <h1>Quelques chiffres</h1>
               <h2 id=bis1><i class="fa fa-chevron-circle-right"></i>&nbsp;Chiffres européens</h2><br>
                   <p>
                       <i class="fa fa-dot-circle-o"></i>&nbsp;Pour 63% des intérrogés, la divulgation d'informations à caractère personnel pose un réel problème.<br><br>
                
                       <i class="fa fa-dot-circle-o"></i>&nbsp;26% seulement des utilisateurs des médias sociaux et 18 % des acheteurs en ligne ont le sentiment de contrôler totalement les informations divulguées.<br><br>
                
                       <i class="fa fa-dot-circle-o"></i>&nbsp;90% pensent qu'il est important d'avoir les mêmes droits et la même protection dans tous les pays de l'UE.<br><br>
                    </p>
                <h2 id=bis1><i class="fa fa-chevron-circle-right"></i>&nbsp;Chiffres français</h2><br>
                    <p>
                       <i class="fa fa-dot-circle-o"></i>&nbsp;En novembre 2015, 82% des Français étaient connectés à l'Internet fixe ou mobile.<br><br>
                       <i class="fa fa-dot-circle-o"></i>&nbsp;6,5 écrans en moyenne par foyer en 2013.<br><br>
                       <i class="fa fa-dot-circle-o"></i>&nbsp;83% des Français utilisent internet, contre 75% en moyenne en Europe en 2012.<br><br>
                       <i class="fa fa-dot-circle-o"></i>&nbsp;8 Français sur 10 estiment que les nouvelles technologies sont devenues "indispensables" (84%) et qu’elles améliorent leur vie quotidienne.<br><br>
                       <i class="fa fa-dot-circle-o"></i>&nbsp;84% des Français considèrent que les nouvelles technologies « menacent la sécurité des données personnelles.<br><br>
                       <i class="fa fa-dot-circle-o"></i>&nbsp;50 % des Français interrogés affirme que la disponibilité et le prix du wifi influent sur leur décision d’acheter un séjour.<br><br>
                    </p>
            </div>
        </div>
    </body>
</html>