package com.skilljobbie.corejava.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

	}

}
