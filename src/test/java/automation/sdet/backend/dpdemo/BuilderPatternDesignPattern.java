package automation.sdet.backend.dpdemo;

public class BuilderPatternDesignPattern {
	
	 // Change return type of each method as Class type
    // "this" always points to current/calling object. Returning the same to
    // have same reference
	
	
	
	// stage1 --> method name , return Type class-->>BuilderPatternDesignPattern
	
	public BuilderPatternDesignPattern stage1() {
		System.out.println("Stage 1");
		return this;
	}
	
	public BuilderPatternDesignPattern stage2(String str) {
		System.out.println("Hello m class from" + str);
		return this;
	} 

	
	public BuilderPatternDesignPattern stage3() {
		System.out.println("Stage 3");
		return this;
	}
	
	public static void main(String[] args) {
		
		BuilderPatternDesignPattern bp = new BuilderPatternDesignPattern();
		bp.stage1().stage2("BuilderPattern").stage3();

	}

}
