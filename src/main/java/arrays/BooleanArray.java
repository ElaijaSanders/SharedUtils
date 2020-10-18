package arrays;

import java.util.ArrayList;
import java.util.List;

public class BooleanArray implements Array<Boolean>{
	private List<Boolean> storage = new ArrayList<>();
	public BooleanArray(boolean...values) {
		for(boolean value : values) this.storage.add(value);
	}
	@Override
	public Boolean get(int index) {
		if(index < this.storage.size()) return this.storage.get(index);
		return null;
	}
	@Override
	public void add(Boolean... values) {
		for(boolean value : values) this.storage.add(value);
	}
	@Override
	public void set(int index, Boolean value) {
		this.storage.set(index, value);
	}
	@Override
	public void remove(int index) {
		if(index < this.storage.size()) this.storage.remove(index);
	}
	public static BooleanArray of(boolean... values){ return new BooleanArray(values); }
	@Override
	public String toString() {
		return this.storage.toString();
	}
}
