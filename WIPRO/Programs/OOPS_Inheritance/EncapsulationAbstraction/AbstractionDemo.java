class Point{
  private int x;
  private int y;

  public void setX(int x){
    this.x = (x > 79 ? 79 : (x < 0 ? 0 : x));
  }
  public void setY(int y){
    this.y = (y > 79 ? 79 : (y < 0 ? 0 : y));
  }
  public int getX(){
    return(x);
  }
  public int getY(){
    return(y);
  }
}





class AbstractionDemo{
  public static void main(String[] args) {
      int a;
      int b;
      Point p = new Point();
      p.setX(4);
      p.setY(5);
      a = p.getX();
      System.out.println("Value of X : "+a);
      b = p.getY();
      System.out.println("Value of Y : "+b);
  }
}
