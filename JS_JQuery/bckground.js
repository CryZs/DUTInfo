(function($){
    $(document).on('click','.pattern',event =>{
        $('body').attr('data-image',$(event.target).data("image"));
    });
})(jQuery)