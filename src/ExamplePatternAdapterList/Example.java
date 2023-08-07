package ExamplePatternAdapterList;

import java.util.Arrays;
import java.util.List;

public class Example
{
    public static void main(String[] args)
    {
        //transformer un tableau en une liste utilisant un adapteur
        String[] array = {"Hello", "World"};
        List<String> list = Arrays.asList(array);
    }
}
