package regex;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LFIRegex
{
    public ArrayList LFIAttack(ResultSet resultSet)
    {
        ArrayList<String> result = new ArrayList<>();
        try{
            String regex = "cmd";
            Pattern pattern = Pattern.compile(regex);

            while(resultSet.next())
            {
                Matcher matcher = pattern.matcher(resultSet.getString(1));
                if(matcher.find())
                {
                    result.add(resultSet.getString(1));
                }
            }
            return result;
        }catch(SQLException e)
        {
            System.out.println(e);
            return null;
        }
    }

    public int numberOfLFIAttacks(ArrayList arrayList)
    {
        int size=0;
        size=arrayList.size();
        return size;
    }
}
