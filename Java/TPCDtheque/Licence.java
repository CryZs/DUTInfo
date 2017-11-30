public enum Licence{
    COPYRIGHT(false),
    /* 
    COPYRIGHT {
        @Override
        public boolean isFree(){
            return false;
        }
    }
    */
    PUBLIC_DOMAIN(true),
    CC_BY_SA(true),
    CC_BY_NC(false);
    /* ------ Fields ----- */
    private boolean free;
    
    /* ------ Constructors ------ */
    private Licence(boolean free){
        this.free=free;
    }
    
    /* ------ Methods ------ */
    private boolean isFree(){
        return free;
    }
}