package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	
	EASY(100), MEDIUM(500), HARD(1000);
	
	private final int iDifficultyValue;
	
	private static final Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();
	
	static {
        for (eGameDifficulty d : eGameDifficulty.values()) {
            lookup.put(d.getDifficultyValue(), d);
        }
    }

    private eGameDifficulty(int value) {
        this.iDifficultyValue = value;
    }

    public int getDifficultyValue() {
        return iDifficultyValue;
    }

    public static eGameDifficulty get(int value) {
        return lookup.get(value);
    }
}
