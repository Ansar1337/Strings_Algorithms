package Strings;

public class Lower {

    public static void main(String[] args) {
        String[] strings = {"111", "ABC", "ABC123", "abcABC", "abc123ABC"};
        for (String s : strings) {
            System.out.println(toLowerCase(s));
        }
    }

    /**
     * Converts all of the characters in this {@code String} to lower case
     *
     * @param s the string to convert
     * @return the {@code String}, converted to lowercase.
     */
    public static String toLowerCase(String s) {
        char[] values = s.toCharArray();
        for (int i = 0; i < values.length; ++i) {
            if (Character.isLetter(values[i]) && Character.isUpperCase(values[i])) {
                values[i] = Character.toLowerCase(values[i]);
            }
        }
        return new String(values);
    }
}