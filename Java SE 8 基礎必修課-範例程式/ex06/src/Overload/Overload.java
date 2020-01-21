package Overload;       //宣告程式檔的類別置於Overload套件內
                        //若程式檔放在(default package)套件下，此行敘述不用寫
class Cmath {
   public int getMax(int a, int b) {
      if (a > b) return a ;
      else       return b ;
   }
 
   public int getMax(int[] vArray) {
      int n = vArray[0];
      for(int i=1; i<vArray.length; i++) {
         if (vArray[i] > n) n = vArray[i];
      }
      return n;
   }
}

public class Overload {                      //主類別
   public static void main(String[] args) {  //主程式
      Cmath max1 = new Cmath();
	  System.out.println("10 和 20 最大數為：" + max1.getMax(10, 20));
	  int[] ary = new int[]{52,66,78,99,11};
	  System.out.println("{52,66,78,99,11} 陣列中最大數為：" + max1.getMax(ary));
   }
}