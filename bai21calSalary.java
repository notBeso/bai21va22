public class bai21calSalary {
    public static void main(String[] args) throws Exception {
        calSalary1(2000000, 10);
        calSalary2(2000000, 10);
        System.out.println(calMonth1(20, 10, 40));
        System.out.println(calMonth2(20, 10));
        
    }

    public static double calSalary1 (double salary , int n){
        if (n > 0){
            return calSalary1(salary*1.1, n-1);
        }
        else{
            System.out.println(salary);
            return salary;
        }
    }

    public static double calSalary2 (double salary , int n){
        for (int count = n ; count > 0 ; count--){
            salary = salary*1.1;
        }
        System.out.println(salary);
        return salary;
    }

    public static int calMonth1 (double money , double rate, double target){
        int count = 0;
        
        while (money < target ){
            money = money*(100+rate)/100;
            return 1 + calMonth1(money, rate, target);
        }
            
            return count;    
    }

    public static int calMonth2 (double salary , double rate){
        double compare = salary*2;
        int count = 0;
        while (compare > salary){
            count++;
            salary = salary*(100+rate)/100;
        }
        return count;
    }
}
