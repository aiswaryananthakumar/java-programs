package com.techitactcorejavalearning.inheritance;

class GrandParent{
	int debt = 1000000;
}
class ParentMain extends GrandParent{
	int  bankbalance=1500000;
	void property() {
		System.out.println("10-acres");
	}
}

class ChildMain1 extends ParentMain{
	
}
class ChildMain2 extends ParentMain{
	
}
public class ParentToChild {

	public static void main(String[] args) {
		ChildMain1 sai = new ChildMain1();
		System.out.println(sai.bankbalance);
		ChildMain2 pallavi = new ChildMain2();
		System.out.println(pallavi.bankbalance);
		
		
	}

}
