package Chapter03;

/*
Consider the following implementation of a class Square:
public class Square
{
private int sideLength;
private int area;
public Square(int initialLength)
{
sideLength = initialLength;
area = sideLength * sideLength;
}
public int getArea() { return area; }
public void grow() { sideLength = 2 * sideLength; }
}

What error does this class have? How would you fix it?
 */
public class R3_16 {

    private int sideLength;
    public int area;

    public R3_16(int initialLength) {
        sideLength = initialLength;
    }

    // to Correct it
    public int getArea() {
        area = sideLength * sideLength;
        return area;
    }

}
