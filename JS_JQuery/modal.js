(function($){
    let modal = $(".modal");
    $(document).on('click','#displayModal',event =>{
        modal.removeClass("hidden");
    });
    $(document).on('click','.overlay',event =>{
        modal.addClass("hidden");
    });
    $(document).on('click',".closeModal",event =>{
        modal.addClass("hidden");
    });
})(jQuery);