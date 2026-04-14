package javainterview;

public interface EggLayer extends Animal1 {
	default public String identifyMyself() {
		return "I am able to lay eggs.";
	}
}
