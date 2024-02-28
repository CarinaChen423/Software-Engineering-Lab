package postalcode;

public class OotumliaPostalCode extends PostalCode {
    public OotumliaPostalCode(String code) throws PostalCodeException
    {
        super(code);
    }
    public String getCountry()
    {
        return "Ootumlia";
    }
    protected void validate() throws PostalCodeException
    {
        String postCode = getCode();
        if(postCode.length() < 4)
            throwException("Postal code too short");

        int pos = 0;

        //1 or 2 letters
        if(!Character.isLetter(postCode.charAt(0)))
            throwException("Expecting letter at position 1");
        pos++;

        if(Character.isLetter(postCode.charAt(1)))
            pos++;

        //Whitespace
        if(!Character.isWhitespace(postCode.charAt(pos)))
            throwException("Expecting space at position "+(pos+1));
        pos++;
        //two digits
        for(int i=0; i<2; i++)
        {
            if(postCode.length() <= pos
                    ||!Character.isLetter(postCode.charAt(pos)))
                throwException("Expecting letter at position "+(pos+1));
            pos++;
        }
        // Expecting nothing
        if(postCode.length() > pos)
            throwException("Unexpected character at end of code");
    }

}


