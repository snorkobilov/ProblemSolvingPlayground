public class IpAddress {
    /**
     * Given a valid (IPv4) IP address, return a defanged version of that IP address.
     * <p>
     * A defanged IP address replaces every period "." with "[.]".
     * <p>
     * Input: address = "1.1.1.1"
     * Output: "1[.]1[.]1[.]1"
     *
     * @param address
     * @return
     */

    public static String defangIPaddr(String address) {
        if (address == null) {
            return null;
        }
        return address.replaceAll("\\.", "[.]");
    }
}
