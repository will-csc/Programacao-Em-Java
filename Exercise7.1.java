public class Main{
    public static void main(String[] args){
        loop(10);
    }
    public static void loop(int n){
        int i = n;
        System.out.println("n\ti");
        while(i > 1){
            System.out.println(n+"\t"+i);
            if(i % 2 == 0){
                i = i / 2;
            }else{
                i = i + 1;
            }
        }
    }
}