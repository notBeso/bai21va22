public class bai21calSalary {
    public static void main(String[] args) throws Exception {
        calSalary1(2000000, 10);
        calSalary2(2000000, 10);
        
    }

    public static double calSalary1 (double salary , int n){
        if (n > 0){
            return calSalary1(salary, n-1)*1.1;
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
}
