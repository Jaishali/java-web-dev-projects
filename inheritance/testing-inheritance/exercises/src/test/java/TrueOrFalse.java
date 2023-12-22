public class TrueOrFalse extends Questions{
    public TrueOrFalse(String question Choice[] choiceArray){
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + "TRUE OR FALSE:" + newLine +
                getQuestion() + newLine +
                getFormattedChoices();

    }

}
