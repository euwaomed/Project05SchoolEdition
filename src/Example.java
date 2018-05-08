public class Example
{
    public static void main(String[] args)
    {
        //System.out.println("hello world");
        Rectangle r1 = new Rectangle(3, 4);
        r1.getWidth(); // 3
        r1.draw('*');
        System.out.println();
        r1.getArea(); // 12
        r1.getPerimeter(); // 14
        Rectangle r2 = new Rectangle(1, 5);
        r2.draw('!');
        r1.toString(); // {type: Rectangle, width: 3, height: 4}
        r1.equals(r2); // false
// comparison based on difference in area
        r1.compareTo(r2); // 7
        Rectangle r3 = new Rectangle(1, 5);
        r2.compareTo(r3); // 0
        r2.equals(r3); // true
        //r2 == r3; // false

        Rectangle[] arr = new Rectangle[3];
        arr[0] = new Rectangle(4, 5);
        arr[1] = new Rectangle(1, 2);
        arr[2] = new Rectangle(3, 2);
        RectangleSorter sorter = new RectangleSorter(arr);
        sorter.sort();
        for(Rectangle item: arr)
            System.out.println(item);
    }
}
