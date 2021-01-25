
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner kbd = new Scanner(System.in);
    String s = kbd.nextLine();
    s = s.toUpperCase();
    int cnt = 0;
    char[] ch = new char[s.length()];
    for(int i = 0;i < s.length();i++){
      ch[i] = s.charAt(i);
      if(ch[i]=='T'||ch[i]=='C'||ch[i]=='G'){
        cnt++;
      }
    }
    int tcnt = 0,gcnt = 0, ccnt = 0,tot,min=0;
    if(cnt == s.length()){
      for(int i = 0;i < s.length();i++){
        if(ch[i]=='T')
          tcnt++;
        else if(ch[i]=='G')
          gcnt++;
        else
          ccnt++;
      }  
      if(tcnt == gcnt && tcnt == ccnt){
        tot = (tcnt*tcnt)+ (gcnt*gcnt) + (ccnt*ccnt) + (7*tcnt);
        System.out.println( tot);
      }
      else{
        if(tcnt <= gcnt && tcnt <= ccnt)
           min = tcnt;
        else if(gcnt <= tcnt && gcnt <= ccnt)
           min = gcnt;
        else if(ccnt <= tcnt && ccnt <= gcnt)
          min = ccnt; 
        tot = (tcnt*tcnt) + (gcnt*gcnt) + (ccnt*ccnt) + (7*min);
        System.out.println(tot);
      }
    }
  }
}