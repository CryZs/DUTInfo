(function($){
    $(document).on('click','button',event =>{
        let i = $(event.target).data("target");
        $(`#onglet-${i}`).addClass("active").siblings('div').removeClass("active");
    });
})(jQuery)