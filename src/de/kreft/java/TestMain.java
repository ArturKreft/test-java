package de.kreft.java;

import java.util.ArrayList;
import java.util.List;


public class TestMain {

	private static final List<Blablah> blas = new ArrayList<>();

	public static void main(String[] args) {


		System.out.println("Hello RailnationWorld");

		blas.add(new Blablah(134));
		blas.add(new Blablah(44));
		blas.add(new Blablah(124));
		blas.add(new Blablah(43524));
		blas.add(new Blablah(3454124));
		blas.add(new Blablah(9));

		System.out.println("Hello RailnationWorld");

		blas.sort((f1, f2) -> Integer.compare(f2.getMe(), f1.getMe()));
		

		for (Blablah b : blas) {
			System.out.println(b.getMe());
		}

		// Hello RailnationWorld
		// 3454124
		// 43524
		// 134
		// 124
		// 44
		// 9
		
	}
	
	private static class Blablah {
		
		private final int a;

		public Blablah(int a) {
			this.a = a;
		}
		
		public int getMe(){
			return a;
		}
	}

}
