
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int sum=0;
        int temp=x;
        while(temp!=0){
            int reminder=temp%10;
            sum=sum*10+reminder;
            temp=temp/10;
        }
        return x==sum;
    }
        public static void main(String[]args){
          Solution solution=new Solution();
          Scanner scanner=new Scanner(System.in);
          System.out.print("Enter the integer:");
          int input=scanner.nextInt();
          boolean result=solution.isPalindrome(input);  
          System.out.print(result);
          scanner.close();
        }

       
}
