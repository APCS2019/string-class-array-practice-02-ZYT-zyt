public class Phrase
{
    private static String currentPhrase;

    /** Constructs a new Phrase object. */
    public Phrase(String p)
    {
         currentPhrase = p;
    }

    /** Returns the index of the nth occurrence of str in the current phrase;
     *  returns -1 if the nth occurrence does not exist.
     *  Precondition: str.length() > 0 and n > 0
     *  Postcondition: the current phrase is not modified.
     */
    public int findNthOccurrence(String str, int n){
        int loc = -1;
        int count = 0;
        int start = 0;
        int sub = -1;
        while((loc = currentPhase.substring(strat).indexof(str))!=-1) ){
          loc += start;
          count++;
          if( count == n){
            return loc -1;
          }
          strat = loc+1;
        }
        return -1;
    }
 
 
 public int findNthOccurrence(String str, int n){
     int loc= -1;
     int count = 0;
     int start = 0;
     int sub = -1;
     while(count != n){
         sub = currentPhrase.subString(start).indexOf(str);
         if(sub == -1){
             retrun -1;
         }
        else if (count == n-1){ 
          return start + sub;
        }
        start += sub + 1;
        count++;
     }
 }

    /** Modifies the current phrase by replacing the nth occurrence of str with repl.
     *  If the nth occurrence does not exist, the current phrase is unchanged.
     *  Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        if(findNthOccurrence(str,n) != -1){
            currentPhrase = currentPhrase.substring(0,findNthOccurrence(str,n)) + repl + currentPhrase.substring(findNthOccurrence(str,n) + str.length());
        }
  
    }

    /** Return the index of the last occurrence of str in the current phrase;
     *  returns -1 if str is not found.
     *  Precondition: str.length() > 0
     *  Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str)
    {
        int i = 1;
        while(findNthOccurrence(str,i) != -1)
            i++;
        return findNthOccurrence(str,i-1);
    }
    /** Returns a string containing the current phrase */
    public String toString(){
        return currentPhrase;
    }
    public static void main(String[] args)
    {

    }
}
