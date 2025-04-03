// this program will not compile.
class ScopeErr{
  public static void main(String args[]){
    int bar = 1;
    {  // creates a new scope
      int bar = 2;  // compile time error - bar already defined!
    }
  }
}
