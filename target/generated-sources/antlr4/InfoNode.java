
public class InfoNode {
	private String identifier;
	private Type type;
	private Object value;
	
	public InfoNode(String identifier, Type type, Object value) {
		this.identifier = identifier;
		this.type = type;
		this.value = value;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
