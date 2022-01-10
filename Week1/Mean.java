public class Mean{
 public static void main(String args[]){
  double sum = 0;
  double no = 0;
  for(String s : args){
   double d = Double.parseDouble(s);
   sum += d;
   no += 1;
   //System.out.println(d);
  }
 System.out.println("Mean: " + sum/no);
 }
}
