/**
 * Created by Aaron Fernandes
 */
import java.security.SecureRandom;

public class Die {
	private int _dieValue;
	private SecureRandom _secureNum;

	Die(){
		this._secureNum=new SecureRandom();
		this._dieValue=this._secureNum.nextInt(6);
	}

	public int get_dieValue(){return this._dieValue;}
}
