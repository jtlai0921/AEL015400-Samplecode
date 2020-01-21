import java.util.*;
public class SetDemo{
  public static void main(String[] args)
  {
    Set<String> hset = new HashSet<>();
    hset.add("台北");        //將字串常值資料存入集合物件中
    //將字串陣列元素資料存入集合物件中
    String[] place = {"新竹", "台中", "台南", "台北"};
    for(String p : place)
      hset.add(p);
    String city = "高雄";
    hset.add(city);         //將字串變數資料存入集合物件中
    System.out.println(hset);  //顯示集合中的所有元素內容
  }
}
