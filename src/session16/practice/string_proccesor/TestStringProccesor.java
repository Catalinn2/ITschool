package session16.practice.string_proccesor;

public class TestStringProccesor {

    public static void main(String[] args) {

        StringProccesor removeWhiteSpaces =  str -> str.trim();
        StringProccesor toUpperCase = str -> str.toUpperCase();

        StringProccesor result = removeWhiteSpaces.andThen(toUpperCase);
        System.out.println("Result: " + result.process("           Happy Friday!"));

    }
}
