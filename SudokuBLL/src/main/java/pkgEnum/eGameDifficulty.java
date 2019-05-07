package pkgEnum;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public enum eGameDifficulty {

	EASY(100), MEDIUM(500), HARD(1000);
	
	private int iPossibleSolutions;
	
	private static final Map<Integer, eGameDifficulty> 
			lookup = new LinkedHashMap<Integer, eGameDifficulty>();

	static {
		for (eGameDifficulty d : eGameDifficulty.values()) {
			lookup.put(d.getiPctRemove(), d);
		}
	}
	
	private eGameDifficulty(int iPctRemove)
	{
		this.iPossibleSolutions = iPctRemove;
	}

	public int getiPctRemove() {
		return iPossibleSolutions;
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