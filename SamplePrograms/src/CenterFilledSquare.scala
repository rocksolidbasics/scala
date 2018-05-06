//Classes are not runnable using main, hence the object

object CenterFilledSquare {

  def main(args: Array[String]): Unit = {
    this.drawCenterFilledSquare(5);
  }

  def drawCenterFilledSquare(n: Int) = {
    val breadth = if(n%2==0) n+1 else n;
    val height = n+1;
    val mid = ((breadth-1)/2)+1

    for(i <- 1 to height) {
      for(j <- 1 to breadth) {
        if(i==0 || i==height) {
          print(n);
        } else {
          if (j == mid) {
            print(i - 1);
          } else {
            print(n);
          }
        }
      }
      println("");
    }
  }
}
