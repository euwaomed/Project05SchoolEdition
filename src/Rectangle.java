public class Rectangle implements Comparable<Rectangle> {
    private int width;
    private int height;

    public Rectangle()
    {
        width = 0;
        height = 0;
    }

    public Rectangle(int w, int h)
    {
        width = w;
        height = h;
    }

    public void setWidth(int w)
    {
        width = w;
    }

    public void setHeight(int h)
    {
        height = h;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public boolean equals(Rectangle r1)
    {
        if(this.width == r1.width && this.height == r1.height)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }

    public int compareTo(Rectangle r1)
    {
        return  getArea() - r1.getArea();
    }

    public String toString()
    {
       return String.format("{type: Rectangle, width: %d, height: %d}", width, height);
    }

    public void draw(char A)
    {
        for(int i = 0; i<height; i++)
        {
            for(int j = 0; j<width; j++)
            {
                System.out.print(A);
            }
            System.out.println();
        }
    }

    public int getArea()
    {
        return width * height;
    }

    public int getPerimeter()
    {
        return 2*width + 2*height;
    }
}
