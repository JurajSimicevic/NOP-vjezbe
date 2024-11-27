package translate_pckg;

public class AppTestTranslator {

    public static void main(String[] args) {
        Translator translator = new Translator();
        translator.setChoice(2);
        translator.translateThis("Ovo je za prijevod");
    }
}
