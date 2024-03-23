import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int index;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizideki indeks : ");
        index = input.nextInt();
        indexException(arr,index);
    }

    public static void indexException (int[] arr, int index) {
        try {
            System.out.println("Seçilen index : " + arr[index] );
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Hata : " +e.getMessage() + " ArrayIndexOutOfBoundsException");
        }
    }
}