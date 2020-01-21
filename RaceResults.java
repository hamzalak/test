import java.util.* ;
 
public class RaceResults{
     
     public static SortedMap<String, TimeDuration >  store = new TreeMap<String,TimeDuration>()   ;    
       
  
     static void onNewResult(String tagNumber, TimeDuration resultTime){
        store.put(tagNumber , resultTime) ; 
     }  
     
     static void printResult(){
     
	    store.forEach((k,v)->System.out.println("Tag : " + k + " Duration : " + v));  
      
     }
        


}
