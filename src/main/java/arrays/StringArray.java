package arrays;

import java.util.ArrayList;
import java.util.List;

public class StringArray implements Array<String> {
	private List<String> storage = new ArrayList<>();
	public StringArray(String... values) {
		for(String value : values) this.storage.add(value);
	}
	@Override
	public String get(int index) {
		if(index < this.storage.size()) return this.storage.get(index);
		return null;
	}
	@Override
	public void add(String... values) {
		for(String value : values) this.storage.add(value);
	}
	@Override
	public void set(int index, String value) {
		this.storage.set(index, value);
	}
	@Override
	public void remove(int index) {
		if(index < this.storage.size()) this.storage.remove(index);
	}
	public static StringArray of(String... values){ return new StringArray(values); }
	@Override
	public String toString() {
		return this.storage.toString();
	}
}
