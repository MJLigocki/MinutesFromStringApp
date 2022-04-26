public class StrangeTimeStringInterpreter {
    private String strangeString;

    public StrangeTimeStringInterpreter(String str) {
        this.strangeString = str;
    }

    public String[] cut() {
        String[] result = strangeString.split("-");
        return result;
    }

    public boolean isAM(String str) {

        boolean result = false;
        if(str.contains("am")) {
            result = true;
        }
        return result;
    }

    public boolean isPM(String str) {

        boolean result = false;
        if(str.contains("pm")) {
            result = true;
        }
        return result;
    }

}
