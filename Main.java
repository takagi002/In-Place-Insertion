class Main {

  public static void inPlaceInsertion(int[] a){
    for(int i = 1; i < a.length; i++){
      int curr = a[i];
      int j = i - 1;
      while(j >= 0 && curr < a[j]){
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = curr;
    }
  }

  public static void main(String[] args) {
    int[] myArr = {10,23,5,1,67,12,27};
    inPlaceInsertion(myArr);
    
    for(int i = 0; i < myArr.length; i++){
      System.out.println(myArr[i]);
    }
    
  }
}