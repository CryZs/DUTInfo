//let carre = $(".carre");
//
//carre.click(function() {
//    let clicks = $(this).attr('data');
//    if (clicks == 0) {
//        carre.attr("data","1");
//    } else {
//        carre.attr("data","0");
//    }
//    $(this).data("clicks", !clicks);
//});
//
//
(function($){
    $(document).on('click','.carre', event => {
        let carre = $(event.target);
        if(carre.hasClass('large')){
            carre.removeClass('large');
        }else{
            carre.addClass('large');
        }
    });
})(jQuery);