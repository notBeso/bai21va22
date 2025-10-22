public class bai22calMonth {
    public static void main(String[] args) throws Exception {
        System.out.println(calMonth1(20, 10, 40));
        System.out.println(calMonth2(20, 10));   
    }


    public static int calMonth1 (double money , double rate, double target){ // bài này cháu đang thêm 1 argument input vì cháu chưa tưởng tượng dc cách làm với 2 input là money và rate
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