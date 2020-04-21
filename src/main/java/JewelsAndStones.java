public class JewelsAndStones {
    /*
    You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
     Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

    The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so
    "a" is considered a different type of stone from "A".

    Example 1:

    Input: J = "aA", S = "aAAbbbb"
    Output: 3
     */

    public static int numJewelsInStones(String J, String S) {
        int output = 0;

        if(S ==null || J ==null){
            return output;
        }

        for(char s: S.toCharArray()){
            for(char j: J.toCharArray()){
                if(s == j){
                    output ++;
                }
            }
        }

        return output;
    }

    public static int numJewelsInStones2(String J, String S){
        return S.replaceAll("[^"+J+"]", "").length();
    }
}
