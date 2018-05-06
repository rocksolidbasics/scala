object FloydsTriagle {

  def main(args: Array[String]) = {
    this.drawFloydsTriagle(15);
  }

  //Improved version rather than having a O(n^2) solution, having two loops
  //This solution runs in O(n) time
  def drawFloydsTriagle(n: Int) = {
    var counter: Int = 2;
    var breaker: Int = 1;

    for(i <- 1 to n) {
      if(i==breaker || i==1) {
        breaker = counter + i;
        counter = counter + 1;
        println(i)
      } else {
        print(i + " ");
      }
    }
  }

}
