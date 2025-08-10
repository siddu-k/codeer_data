import java.util.HashMap;

public class Main {

  static int[] arry = {2,4,6,5,8,10};
  static int target = 9;

  public static void main(String[] args){

    HashMap<Integer , Integer> mapp = new HashMap<>();

    for(int i = 0; i < arry.length; i++){
      int req = target - arry[i];

      if(mapp.containsKey(req)){
        System.out.println("Pair found: " + arry[i] + " + " + req + " = " + target);
        System.out.println("Indexes: " + i + " and " + mapp.get(req));
        break; // Stop after finding first pair
      }
      mapp.put(arry[i], i);
    }
  }
}
