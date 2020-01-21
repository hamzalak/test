public class TimeDuration{

      int time ; 
      int hours ; 
      int minutes ;
      int seconds ; 
       
       public TimeDuration(int time) throws Exception{
       
       if ( time < 0 )  throw new Exception("valeur negative ") ; 
       if( time ==0) System.out.print("0s") ; 
           this.time = time     ;
           
           this.hours = time / 3600 ; 
           
           int passMin = time % 3600 ; 
            
           this.minutes = passMin / 60 ; 
           
           int passSec = this.minutes % 60 ; 
           
           this.seconds = passSec /60 ;   
           
       }
       
       
       public String toString(){
       
               System.out.println(String.valueOf(this.hours)+"s "+String.valueOf(this.minutes)+"m "+String.valueOf(this.seconds)) ; 
               return String.valueOf(this.hours)+"s "+String.valueOf(this.minutes)+"m "+String.valueOf(this.seconds) ; 
       }
       
       
      
}
