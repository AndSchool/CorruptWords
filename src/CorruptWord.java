public class CorruptWord {
    private String word;


    /* PRECONDITIONS: word will contain all capital letters
     *                with no spaces or other non-letter symbols;
     *                word.length() >= 2
     */
    public CorruptWord(String word) {
        this.word = word;
    }


    /* getter method for word */
    public String getWord() {
        return word;
    }

    public String Corrupting(){
        String print = getWord();
        String newString="";
        String symbols="!@#$%^&*";
        int randomNum;
        for(int i = 0; i < print.length()-1; i++)
        {
            randomNum = (int) (Math.random() * 3);
            if(randomNum<3){
                randomNum = (int) (Math.random() * 7);
                newString+=symbols.substring(randomNum, randomNum + 1);
            }
            else{
                newString+=print.substring(i, i + 1);
            }

        }

        return newString;

    }

}
