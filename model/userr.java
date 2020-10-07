package springmvc.model;

import java.util.List;

public class userr {

	
	private String name;
    private String cricket;
    
    private List<String> flag;
    

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCricket() {
		return cricket;
	}

	public void setCricket(String cricket) {
		this.cricket = cricket;
	}

	public List<String> getFlag() {
		return flag;
	}

	public void setFlag(List<String> flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "userr [name=" + name + ", cricket=" + cricket + ", flag=" + flag + "]";
	}

//	private String email;
//	private String pass;
//	
}
