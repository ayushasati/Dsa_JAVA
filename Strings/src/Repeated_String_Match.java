public class Repeated_String_Match {
    public int repeatedStringMatch(String a, String b) {
        int loop = b.length()/a.length();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i <loop + 3; i++) {
            if (temp.toString().contains(b)){
                return i;

            }
            else {
                temp.append(a);
            }

        }
        return -1 ;

    }

}
