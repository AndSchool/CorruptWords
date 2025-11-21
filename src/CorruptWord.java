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
        String symbols="!@#$%^&*___????";
        int randomNum;
        for(int i = 0; i < print.length(); i++)
        {
            randomNum = (int) (Math.random() * 3);
            if(randomNum<2){
                randomNum = (int) (Math.random() * 13);
                newString+=symbols.substring(randomNum, randomNum + 1);
                if (randomNum<1){
                    for (int x = 0; x < (Math.random() * 4); x++) {
                        newString+=print.substring(i, i + 1);
                    }
                }
                if (randomNum<2){
                    newString+=" ";
                }

            }
            else{
                randomNum = (int) (Math.random() * 3);
                if (randomNum<1){
                    newString+="";
                }else{
                    newString+=print.substring(i, i + 1);
                }

            }

        }

        return newString;

    }
    public String Encrypt(){
        String print = getWord();
        String newString="";
        String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int randomNum;
        char currentChar;
        int currentNum;
        print=print.toUpperCase();
        randomNum = (int) (Math.random() * 10);
        for(int i = 0; i+randomNum < symbols.length(); i++)
        {
            currentChar = (print.charAt(i));

        }

        return newString;

    }
}
