package sequality;

public class Calculate {
  public int sum(int x, int y){
    return x + y;
  }

  public double ave(int x, int y){
    int num;
    double ave;

    num = sum(x,y);
    return ave = num / 2.0;

  }

  public int loop_sum(int x, int y){
    int num=0;
    int i = 0;
    for(i=x; i<=y; i++){
      num += i;
    }
    return num;

  }

  public double loop_ave(int x, int y){
    int cnt=0;
    int j = 0;

    for(j=y; j>=x; j--){
      cnt++;
    }

    return loop_sum(x, y) / (double)cnt;

  }

  public int odd_even(int x, int y, int b){
    int num = 0;
    if(b != 0){
      for(int i=x; i<=y; i++){
          if(i % 2 != 0){
            num += i;
          }
      }

    }else if(b == 0){
      for(int i=x; i<=y; i++){
          if(i % 2 == 0){
            num += i;
          }
      }
    }

    return num;

  }

}
