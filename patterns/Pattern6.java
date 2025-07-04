package com.skilljobbie.corejava.patterns;

public class Pattern6 {

	public static void main(String[] args) {
		int height = 5;
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
