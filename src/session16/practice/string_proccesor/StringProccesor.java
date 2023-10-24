package session16.practice.string_proccesor;

@FunctionalInterface
public interface StringProccesor {

    String process(String input);

    default StringProccesor andThen(StringProccesor after) {
        return input -> after.process(this.process(input));
    }
}
