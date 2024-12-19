package UnionFind.Leetcode;

public class IntegerToEnglishWord {
    private final String[] underTwenty={"","One","Two", "Three" , "Four", "Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Eighteen","Nineteen"};
    private final String[] tens={"","Twenty","Thirty","Forty","Fifty","Sixty" ,"Seventy","Eighty","Ninety"};
    private final String[] more={"","Thousand","Million","Billion"};
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        int i=0;
        String result="";
        while(num>0){
            if(num%1000!=0){
                result=helper(i%1000)+more[i]+" "+result;
            }
            num/=1000;
            i++;
        }
        return result.trim();
    }
    public String helper(int number){
        if(number==0) return "Zero";
        else if (number<20) {
            return underTwenty[number]+" ";
        }
        else if (number<100) {
            return tens[number/10]+" "+helper(number%10);
        } else {
            return underTwenty[number/100]+"  Hundred"+helper(number%100);
        }
    }
}
