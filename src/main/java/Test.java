import org.apache.commons.lang3.StringUtils;

public class Test {

    public static void main(String[] args) {
        String jordan = "jordan";
        StringUtils.isNumeric(jordan);
        StringUtils.swapCase(jordan);
        StringUtils.reverse(jordan);

        System.out.println(StringUtils.isNumeric("Is Jordan a number?" + jordan));
        //nothing numeric always false
        System.out.println(StringUtils.swapCase("Is Jordan in swap case CAPS " + jordan));
        //swap uppercase to lower case and lower to upper
        System.out.println(StringUtils.reverse("Is Jordan backwards" + jordan));
        //prints everything backwards

    }
}
