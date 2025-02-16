class Main{
    public static void main(String[] args) {
        String word = "rogith abcd";
        String reverse_word ="";
        for(int i=0;i<word.length();i++){
            reverse_word=word.charAt(i)+reverse_word;
        }
        System.out.println("The original is: "+word);
        if(word.equalsIgnoreCase(reverse_word)){
            System.out.println("Palindrome: "+reverse_word);
        }
        else{
            System.out.println("Not Palindrome: "+reverse_word);
        }
    }
}