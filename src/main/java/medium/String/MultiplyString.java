package medium.String;

public class MultiplyString {
    public String multiply(String num1, String num2) {
        int[] product = new int[num1.length() + num2.length()];

        for(int i = num1.length() - 1; i >= 0; i--){
            for(int j = num2.length() - 1; j >= 0; j--){
                int mult = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                //The product always goes to i+j+1
                //Add any previous value
                int finalValue = mult + product[i+j+1];

                product[i+j+1] = finalValue%10;
                product[i+j] += finalValue/10;
            }
        }

        StringBuilder result = new StringBuilder();
        for(int prod : product){
            if(result.length() == 0 && prod == 0){
               continue; //Ignore the zeroes in the begininng
            }
            result.append(prod);
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
