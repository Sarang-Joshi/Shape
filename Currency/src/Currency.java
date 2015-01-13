/**
 * Created by Sarang on 12/01/2015.
 */
public class Currency
{
    private String currencyName;
    public Currency()
    {

    }
    public String getCurrencyName (String countryName )
    {
        if(countryName=="India")
        {
            return "Rupees";
        }
        else if(countryName=="UK")
        {
            return "Pound";
        }
        else if(countryName=="US")
        {
            return "Dollar";
        }
        return "s";
     }
}
