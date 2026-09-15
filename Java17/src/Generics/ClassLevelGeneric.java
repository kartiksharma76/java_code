package Generics;
// Basic principle in any programming language 
// each instruction must be deterministic(unique) not ambiguity
// class extends class 
// interface extends interface
//class  implements interface
// here before using implements or extends keyword we must know both of the types like above then only
// we can decide implements or extends otherwise we can't
// like wise  in generic we know only one type or none.
// so with respect to generic concepts we have two option to use extends and implements keywords.
// but as  basic principle in programming language every instruction must be deterministic so Java designers
// opted extends keyword.
public class ClassLevelGeneric<T extends A,U extends X> {

}
// wild card is not applicable on class level in generic 
//class ClassLevel<?>{
//	
//}
// super is also not applicable on class level in generic 
//class ClassLevel1<T super U>{
//	
//}

//class ClassLevel2<T implements U>{
//	
//}
