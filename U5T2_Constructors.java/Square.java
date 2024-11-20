public class Square {
    private int side;
    private String name;

    public Square() {
      side = 10;
      name = "";
    }
  
    public int getSide() {
      return side;
    }
  
    public String getName() {
      return name;
    }
  
    public String info() {
      return "side: " + side + ", name: " + name;
    }

    public static void main(String[] args) {
      Square mySquare = new Square();
String squareName = mySquare.getName();
if (squareName.equals("cool square")) {
   System.out.println("It's a cool square!");
} else {
   System.out.println("It's NOT a cool square!");
}

    }
  }
  