package pkgEnum;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public enum eGameDifficulty {

	EASY(10), MEDIUM(30), HARD(60);
	
	private int iPctRemove;
	
	private static final Map<Integer, eGameDifficulty> 
			lookup = new LinkedHashMap<Integer, eGameDifficulty>();

	static {
		for (eGameDifficulty d : eGameDifficulty.values()) {
			lookup.put(d.getiPctRemove(), d);
		}
	}
	
	private eGameDifficulty(int iPctRemove)
	{
		this.iPctRemove = iPctRemove;
	}

	public int getiPctRemove() {
		return iPctRemove;
	}
	
	public static eGameDifficulty get(int iPctRemove) {

		Iterator it = lookup.entrySet().iterator();
		eGameDifficulty eGD = null;

		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			eGameDifficulty enumDifficulty = (eGameDifficulty) pair.getValue();
			int iDifficultyValue = (int) pair.getKey();
			if (iPctRemove >= iDifficultyValue) {
				eGD = enumDifficulty;
			}
		}
		return eGD;
	}
	
	
	
	
}