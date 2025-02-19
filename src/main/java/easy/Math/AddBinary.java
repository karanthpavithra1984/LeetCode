package easy.Math;

public class AddBinary {
    public String addBinary(String a, String b) {
        int aIndex = a.length()-1;
        int bIndex = b.length()-1;

        StringBuilder result = new StringBuilder();
        int carry = 0 ;

         while (aIndex >= 0 || bIndex >= 0) {
            if(aIndex > -1 &&  a.charAt(aIndex) == '1') carry++;
            if(bIndex > -1 &&  b.charAt(bIndex) == '1') carry++;

            if(carry % 2 == 0){
                result.append("0");
            }else{
                result.append("1");
            }

            carry = carry / 2;

             aIndex--;
             bIndex--;
        }

        return carry == 1? carry + result.reverse().toString() :  result.reverse().toString();
    }
}
