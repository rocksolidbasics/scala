//Classes are not runnable using main, hence the object

/**
  * Print console values as:
  * 55555
  * 55155
  * 55255
  * 55355
  * 55455
  * 55555
  */

object CenterFilledSquare {

  def main(args: Array[String]): Unit = {
    this.drawCenterFilledSquare(5);
  }

  def drawCenterFilledSquare(n: Int) = {
    //Increase the breadth by 1 if the input is even, so that a middle
    //column can be introduced
    val breadth = if(n%2==0) n+1 else n;

    //Increase the height by 1 to compensate the extra first row having
    //the boundary value
    val height = n+1;

    //Determine the middle line where the increment values needs to be
    //printed
    val mid = ((breadth-1)/2)+1

    //Interate row by row
    for(i <- 1 to height) {
      //Print column by column
      for(j <- 1 to breadth) {
        if(i==1 || i==height) {
          print(n);
        } else {
          if (j == mid) {
            print(i - 1);
          } else {
            print(n);
          }
        }
      }
      //Add next line
      println("");
    }
  }
}
