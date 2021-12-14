package com.aaludra;

public class OrderPair<K, V> implements Pair<K, V> {
	private K key;
	private V value;

	public OrderPair(K k, V v) {
		this.key = k;
		this.value = v;
	}

	@Override
	public K getkey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getvalue() {
		// TODO Auto-generated method stub
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer, String> obj = new OrderPair<>(101, "Babu");
		Pair<Integer, String> obj2 = new OrderPair<>(102, "Hari");
		System.out.println("Key:" + obj.getkey());
		System.out.println("Value:" + obj.getvalue());
		System.out.println("---------------------------");
		System.out.println("Key:" + obj2.getkey());
		System.out.println("Value:" + obj2.getvalue());

	}

}
