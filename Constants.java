class Constants {
    public static void main ( String[] args ) {
        // Constant score values.
        final int TRY = 5 ;
        final int CONVERSION = 1 ;
        final int PENALTY = 3 ;

        int t, c, p, total ;

        // Calculate points scored
        t = 4 * TRY ;
        c = 3 * CONVERSION ;
        p = 2 * PENALTY ;
        total = ( t + c + p ) ;

        // Output calculated total
        System.out.println( "Score: " + total ) ;
    }
}