package cs335;


public interface Prototype extends Cloneable {
	
	public AccessControl clone() throws CloneNotSupportedException;

}