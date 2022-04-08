package utils;

public class EnumUtils {
    public static boolean isValueInEnum(Enum[] data, String searchValue) {
        for (Enum value : data) {
            if (value.name().equals(searchValue)) {
                return true;
            }
        }

        return false;
    }
}
