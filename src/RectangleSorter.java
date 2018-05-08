public class RectangleSorter {

    private Rectangle[] array;

    public RectangleSorter(Rectangle[] arr)
    {
        array = arr;
    }

    public void sort()
    {
        for(int i = 0; i<array.length; i++)
        {
            int m = min(i);
            swap(m, i);
        }

    }

    private int min(int start)
    {
        int min = start;
        for(int i = start; i< array.length; i++)
        {
            if (array[min].compareTo(array[i]) > 0)
            {
                min = i;
            }
        }
        return  min;
    }

    private void swap(int i, int j)
    {
        Rectangle t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
