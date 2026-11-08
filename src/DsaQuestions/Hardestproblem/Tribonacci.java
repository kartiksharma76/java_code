package DsaQuestions.Hardestproblem;

public class Tribonacci {
    public int tribonacci(int n ){
        if(n == 0){
            return 0;
        }else if( n== 1 || n == 2){
            return 1;
        }else{
            int firstterm = 0;
            int secondterm = 1;
            int thirdterm = 1;

            for (int i = 3; i <= n; i++){
                int fourthterm = firstterm + secondterm + thirdterm;
                firstterm = secondterm;
                secondterm = thirdterm;
                thirdterm = fourthterm;
            }
            return thirdterm;
        }
    }

    public static void main(String[] args) {
   Tribonacci obj = new Tribonacci();
        System.out.println(obj.tribonacci(4));
        System.out.println(obj.tribonacci(25));
    }

}

