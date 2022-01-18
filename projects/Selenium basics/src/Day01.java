public class Day01 {
    public static void main(String[] args) {
        String [] arr={"ac", "bd", "ct","de","e","f","g","hz","t","l"};
        //this loop prints out every third item.
        for(int i = 2; i < arr.length; i += 3){
            if(arr[i].contains("t") && arr[i].length()>1) {
                System.out.println("Value not allowed");
            } else {
                System.out.println(arr[i]);

            }
        }
    }
}
