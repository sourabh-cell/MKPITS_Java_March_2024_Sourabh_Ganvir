package bean;

public class Student {
	
	 private String name;
	 private int mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	 
	 public String getResult() {
         if (mark>35) {
			return "pass";
		}		
         
         else {
			return "fail";
		}
	}
	 

}