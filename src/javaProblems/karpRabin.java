package javaProblems;

class karpRabin {

    private static final long PRIME = 101;

    public static void main(String[] args) {

        String pattern = "suren";
        String word = "kunalrahulsurenarav";

        int idx =KarpRabin(pattern , word);

        if(idx == -1){
            System.out.println("Not found");
        }else {
            System.out.println("found at " + idx);
        }

    }

    public static int KarpRabin(String pattern , String word){

        double Multiplier =  Math.pow(PRIME ,pattern.length()-1.0);

        double hashPattern = getHash(pattern);
        double hashSubstring = getHash(word.substring(0 , pattern.length()));

        for(int i = 0  ; i< word.length()-pattern.length() ; i++){

            if(hashPattern == hashSubstring){
                if(pattern.equals(word.substring(i , i+pattern.length()))){
                    return i;
                }
            }

            hashSubstring = rehash(hashSubstring , word.charAt(i) , word.charAt(i+pattern.length())  , Multiplier );

        }


        return -1;
    }

    private static double getHash(String pattern){

        double hashCode = 0;


        for(int i =0 ; i< pattern.length() ; i++){

            hashCode+= (pattern.charAt(i))* Math.pow(PRIME ,i);

        }

        return hashCode;


    }

    private static double rehash(double oldhash , char oldChar , char newChar , double Multiplier ){

        double newhash = (oldhash -  oldChar)/PRIME;
        newhash = newhash + newChar*Multiplier;
        return newhash;

    }


}