package arrays;

import java.util.ArrayList;
import java.util.List;

public class DoubleArray implements Array<Double> {
	private List<Double> storage = new ArrayList<>();
	public DoubleArray(Double... values) {
		for(double value : values) this.storage.add(value);
	}
	@Override
	public Double get(int index) {
		if(index < this.storage.size()) return this.storage.get(index);
		return null;
	}
	@Override
	public void add(Double... values) {
		for(double value : values) this.storage.add(value);
	}
	@Override
	public void set(int index, Double value) {
		this.storage.set(index, value);
	}
	@Override
	public void remove(int index) {
		if(index < this.storage.size()) this.storage.remove(index);
	}
	@Override
	public String toString() {
		return this.storage.toString();
	}
}
