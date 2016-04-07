package mappings;
import com.google.gson.Gson;
import dto.AccountDTO;

public abstract class AccountDTODigester {
	  public static String digestJSON(AccountDTO dto){
		  String json = new Gson().toJson(dto);
		  System.out.println(json.toString());
		  return json;
	  }
}
