import java.sql.SQLOutput;

public class Main {
    private static int searchIndex(int[] array,int value){
        int index = 0;
        int limit = array.length - 1 ;
        while (index <= limit){
            int point = (int) Math.ceil((index + limit)/2);//można double ale to trzeba będzie przetestować
            int entry = array[point];
            if (value > entry){
                index = ++point;
                continue;
            }else if (value < entry){
                limit = --point;
                continue;
            }
            return point;
        }
        return -1;
    }

    public static void main(String[] args)  {

        int[] array = new  int[]{4, 5, 7, 11, 12, 15, 15, 21, 40, 45};
        System.out.println(searchIndex(array,11));

    }



}
