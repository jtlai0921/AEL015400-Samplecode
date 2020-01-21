 import java.util.*;
 public class ArrayListDemo{
   public static void main(String[] args)
   {
     System.out.println("～東部旅遊夜宿規劃～");
     ArrayList<String> night = new ArrayList<>();
     String[] place = {"宜蘭", "花蓮", "天祥", "台東"};
     for(String p : place)
       night.add(p);
     System.out.println("初期規劃夜宿地點：" + night);
     System.out.println("初期規劃夜宿天數：" + night.size());
     night.add("知本");
     night.add(3,"花蓮");
     System.out.println("修訂後夜宿地點：" + night);
     System.out.println("修訂後規劃夜宿天數：" + night.size());
     System.out.println("夜宿天祥規劃在第幾天：" + (night.indexOf("天祥")+1));
     System.out.println("刪除花蓮第一夜...");
     night.remove(night.indexOf("花蓮"));
 
     System.out.println("\n～確定夜宿表列～");
     for(int i=0; i<night.size(); i++)
       System.out.println("第 " + (i+1) + " 天夜宿地點：" + night.get(i));
   }
 }
