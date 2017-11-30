(function($){
    let elem = $("<div>"); // Crée une balise div
    elem.text("Coucou");
    let content = $("#content");
//    let elem = $("div"); // Sélectionne les div
    // prepend -> au début
    // append -> fin
    $("#content").prepend(elem);
    $("#content").prepend($("<h1>").text("Title"));
    $('body').css({"background-color":"yellow"});
    console.log($("#anchor").data("foo"));
    console.log(content.prop("tagName"));
    console.log($("#anchor").parents()); 
    
    let listener = $('#listener');
    
    listener.on('keyup', e=> console.log("KEY UP"));
    listener.on('keydown', e=> console.log("KEY DOWN"));
})(jQuery);



//(function(arg){
//    
//})(1);