package tea_party;

public class teaParty {
	private String name;
	private boolean  isWoman;
	private boolean  isKnighted;

	/*public teaParty(String name, boolean isWoman, boolean isKnighted) {
		this.name = name;
		this.isWoman = isWoman;
		this.isKnighted = isKnighted;
	}
	*/

    public String welcome(String name, boolean isWoman, boolean isKnighted)
    {
    		this.name = name;
		this.isWoman = isWoman;
		this.isKnighted = isKnighted;
    		if(isKnighted==true) {
    			if(isWoman==true) {
    				return "Hello Lady " +name; 
    			}else {
    				return "Hello Sir " +name; 
    			}
    		}else if(isWoman==true) {
    			return "Hello Ms. "+name;
    		}else if(isWoman==false) {
    			return "Hello Mr. "+name;
    		}
    		return "";
    }
    public String getName() {
    	return name;
    }
}
