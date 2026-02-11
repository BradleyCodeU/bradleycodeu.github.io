
import static org.junit.Assert.*;
import org.junit.Test;

public class Test_PhoneNumberApp {

    @Test
    public void testIsPhoneFormat() {
        // Valid format
        assertTrue("Should return true for valid format", 
            PhoneNumberApp.isPhoneFormat("(415) 555-1212"));
        
        // Invalid formats
        assertFalse("Should be false: missing symbols", 
            PhoneNumberApp.isPhoneFormat("4155551212"));
        assertFalse("Should be false: missing space at index 5", 
            PhoneNumberApp.isPhoneFormat("(415)555-1212"));
        assertFalse("Should be false: missing hyphen at index 9", 
            PhoneNumberApp.isPhoneFormat("(415) 5551212"));
        assertFalse("Should be false: wrong delimiters", 
            PhoneNumberApp.isPhoneFormat("415-555-1212"));
        assertFalse("Should be false: wrong length", 
            PhoneNumberApp.isPhoneFormat("(41) 555-12123"));
    }

    @Test
    public void testNumberStringToPhoneFormat() {
        // Standard 10-digit conversion
        assertEquals("(123) 456-7890", PhoneNumberApp.numberStringToPhoneFormat("1234567890"));
        
        // 911 Case
        assertEquals("911", PhoneNumberApp.numberStringToPhoneFormat("911"));
        
        // Already formatted case - logic should detect isPhoneFormat is true
        assertEquals("(123) 456-7890", PhoneNumberApp.numberStringToPhoneFormat("(123) 456-7890"));
        
        // Error case
        assertEquals("Error: Not a 10-digit number string", 
            PhoneNumberApp.numberStringToPhoneFormat("12345"));
    }

    @Test
    public void testPhoneFormatToNumberString() {
        // Standard strip conversion
        assertEquals("6785674321", PhoneNumberApp.phoneFormatToNumberString("(678) 567-4321"));
        
        // 911 Case
        assertEquals("911", PhoneNumberApp.phoneFormatToNumberString("911"));
        
        // Error case
        assertEquals("Error: Not a 14-digit phone format string", 
            PhoneNumberApp.phoneFormatToNumberString("678-567-4321"));
    }

    @Test
    public void testCompareAreaCodes() {
        String phone1 = "(614) 555-1212";
        String phone2 = "(614) 999-0000";
        String phone3 = "(212) 555-1212";
        String phone4 = "(702) 555-1212";

        // Same area codes
        assertEquals("Should return 0 for matching area codes", 0, 
            PhoneNumberApp.compareAreaCodes(phone1, phone2));
        
        // First is smaller (212 < 614)
        assertTrue("Should return negative if first area code is smaller", 
            PhoneNumberApp.compareAreaCodes(phone3, phone1) < 0);
        
        // First is larger (702 > 614)
        assertTrue("Should return positive if first area code is larger", 
            PhoneNumberApp.compareAreaCodes(phone4, phone1) > 0);
    }
}